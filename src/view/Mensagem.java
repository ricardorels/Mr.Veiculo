package view;

public class Mensagem {
	public static void mensagem(int valor){
		if(valor==1){
			System.out.println("Menu Principal");
			System.out.println("1. Cadastrar novo cliente");
			System.out.println("2. Cadastrar novo veiculo");
			System.out.println("3. Locar veiculo");
			System.out.println("4. Listar clientes cadastrados");
			System.out.println("5. Listar veiculos cadastrados");
			System.out.println("0. Sair");
			System.out.print("Escolha uma das opcoes: ");
		}
		else if(valor==2){
			System.out.println("Erro ao validar! Ha um ou mais campos obrigatorios vazios!");
		}
	}
}
