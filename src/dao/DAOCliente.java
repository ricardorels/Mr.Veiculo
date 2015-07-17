package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import view.ClienteFisico;
import view.ClienteJuridico;
import view.ConexaoMySQL;

public class DAOCliente {
	
	ConexaoMySQL con = new ConexaoMySQL("root", "");
	Connection conexao = con.getConexao();
	
	public void armazenarClienteFisico(ClienteFisico fis){
		try{
			PreparedStatement pstmt;
			pstmt = conexao.prepareStatement("INSERT INTO clientefisico (nome,cpf,rg,habilitacao,endereco,tel1,tel2) VALUES (?,?,?,?,?,?,?)");
			pstmt.setString(1, fis.nome);
			pstmt.setString(2, fis.cpf);
			pstmt.setString(3, fis.rg);
			pstmt.setString(4, fis.habilitacao);
			pstmt.setString(5, fis.endereco);
			pstmt.setString(6, fis.tel1);
			pstmt.setString(7, fis.tel2);
			pstmt.executeUpdate();
			
		}catch(SQLException e){
			System.err.println("Excessao!");
		    System.err.println(e.getMessage());
		}	
	}
	
	public void armazenarClienteJuridico(ClienteJuridico jur){
		try{
			PreparedStatement pstmt;
			pstmt = conexao.prepareStatement("INSERT INTO clientejuridico (nome,cnpj,endereco,tel1,tel2) VALUES (?,?,?,?,?)");
			pstmt.setString(1, jur.nome);
			pstmt.setString(2, jur.cnpj);
			pstmt.setString(3, jur.endereco);
			pstmt.setString(4, jur.tel1);
			pstmt.setString(5, jur.tel2);
			pstmt.executeUpdate();
			
		}catch(SQLException e){
			System.err.println("Excessao!");
		    System.err.println(e.getMessage());
		}	
	}
	
	public ResultSet listarClientesFisicos(String consulta) throws SQLException{
		PreparedStatement pstmt = conexao.prepareStatement(consulta);
		ResultSet rs = pstmt.executeQuery();
		return rs;
	}
	
	public ResultSet listarClientesJuridicos(String consulta) throws SQLException{
		PreparedStatement pstmt = conexao.prepareStatement(consulta);
		ResultSet rs = pstmt.executeQuery();
		return rs;
	}
}
