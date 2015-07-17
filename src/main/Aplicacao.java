package main;
import java.sql.SQLException;
import java.util.Scanner;

import view.Mensagem;
import view.ViewCliente;
import view.ViewLocacao;
import view.ViewVeiculo;

public class Aplicacao {
	
	public static void main(String[] args) throws SQLException{
		int op;
		Scanner lerInt = new Scanner(System.in);
		
		do{
			Mensagem.mensagem(1);
			
			op = lerInt.nextInt();
			
			ViewCliente cliente = new ViewCliente();
			ViewVeiculo veiculo = new ViewVeiculo();
			ViewLocacao locacao = new ViewLocacao();
			
			switch(op){
				case 1:
					cliente.cadCliente();
				break;
				
				case 2:
					veiculo.cadVeiculo();
				break;
				
				case 3:
					locacao.locVeiculo();
				break;
				
				case 4:
					cliente.impClientes();
				break;
				
				case 5:
					veiculo.impVeiculos();
				break;
			
			}
			
			
		}while(op!=0);
	}
}
