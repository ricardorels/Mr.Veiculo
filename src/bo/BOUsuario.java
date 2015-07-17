package bo;

import view.ConexaoMySQL;

public class BOUsuario {
	public void validar_usuario(ConexaoMySQL conexao){
		if(conexao.getUsuario()== "" || conexao.getSenha() == "" || conexao.getUsuario() == null || conexao.getSenha() == null) {
			System.out.println("Nao foi possivel validar o usuario!");
		}
	}
}
