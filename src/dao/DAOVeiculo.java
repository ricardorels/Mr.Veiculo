package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import view.ConexaoMySQL;
import view.Veiculo;

public class DAOVeiculo {
	ConexaoMySQL con = new ConexaoMySQL("root", "");
	Connection conexao = con.getConexao();
	
	public void armazenarVeiculo(Veiculo v){
		try{
			PreparedStatement pstmt;
			pstmt = conexao.prepareStatement("INSERT INTO veiculo (marca,modelo,placa,chassi,cor,qtdPortas,statusLocado) VALUES (?,?,?,?,?,?,?)");
			pstmt.setString(1, v.marca);
			pstmt.setString(2, v.modelo);
			pstmt.setString(3, v.placa);
			pstmt.setString(4, v.chassi);
			pstmt.setString(5, v.cor);
			pstmt.setInt(6, v.qtdPortas);
			pstmt.setBoolean(7, false);
			pstmt.executeUpdate();
			
		}catch(SQLException e){
			System.err.println("Excessao!");
		    System.err.println(e.getMessage());
		}
		
	}
	
	public ResultSet listarTodosOsVeiculosDoBanco(String consulta) throws SQLException{
		PreparedStatement pstmt = conexao.prepareStatement(consulta);
		ResultSet rs = pstmt.executeQuery();
		return rs;
	}
	
}
