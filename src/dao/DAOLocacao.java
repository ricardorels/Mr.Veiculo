package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import view.ConexaoMySQL;
import view.Locacao;

public class DAOLocacao {
	ConexaoMySQL con = new ConexaoMySQL("root", "");
	Connection conexao = con.getConexao();
	
	public void cadLocacao(Locacao veiculoASerLocado){
		try{
			PreparedStatement pstmt;
			pstmt = conexao.prepareStatement("INSERT INTO locacao (codCliente,idVeiculo) VALUES (?,?)");
			pstmt.setString(1, veiculoASerLocado.codCliente);
			pstmt.setInt(2, veiculoASerLocado.idVeiculo);
			pstmt.executeUpdate();
			System.out.println("Locacao realizada com sucesso!");
			
		}catch(SQLException e){
			System.err.println("Excessao!");
		    System.err.println(e.getMessage());
		}
	}
}
