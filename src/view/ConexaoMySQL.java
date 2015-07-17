package view;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
 
public class ConexaoMySQL implements IConexao {
 
	private String usuario;
	private String senha;
	private static Connection conexao=null;
	
	
	public ConexaoMySQL(String usuario, String senha) {
		this.usuario = usuario;
		this.senha = senha;
	}
 
	@Override
	public Connection getConexao() {		
		try {
				Class.forName("com.mysql.jdbc.Driver");
				conexao = DriverManager.getConnection("jdbc:mysql://localhost/mrveiculos", this.usuario, this.senha);
				//System.out.println("Conexao realizada com sucesso!");
			
	     	}catch (ClassNotFoundException | SQLException e) {
	    	 	throw new RuntimeException("Erro na conexão: "+e.getMessage());
	     	 }
		
		return conexao;
	}
	
	public String getUsuario(){
		return this.usuario;
	}
	
	public String getSenha(){
		return this.senha;
	}
}