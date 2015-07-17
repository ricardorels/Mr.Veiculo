package view;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
import dao.DAOLocacao;
import dao.DAOVeiculo;

public class ViewLocacao {
	public String cpfCliente;
	public int idVeiculo;
	Scanner lerInt = new Scanner(System.in);
	Scanner lerString = new Scanner(System.in);
	public int op;
	
	public void locVeiculo() throws SQLException{
		
		System.out.println("Locar para: ");
		System.out.println("1. Pessoa Fisica.");
		System.out.println("2. Pessoa Juridica.");
		
		op=lerInt.nextInt();
		
		switch(op){
			case 1:{
				System.out.println("Digite o cpf do cliente: ");
				cpfCliente=lerString.nextLine();
				
				DAOVeiculo buscaVeiculo = new DAOVeiculo();
				DAOLocacao locarVeiculo = new DAOLocacao();
				
				ResultSet rs = buscaVeiculo.listarTodosOsVeiculosDoBanco("select * from veiculo");
				
				while(rs.next()){
					Veiculo veiculo = new Veiculo(rs.getString("marca"),rs.getString("modelo"),rs.getString("placa"),rs.getString("chassi"),rs.getString("cor"),rs.getInt("qtdPortas"),rs.getBoolean("statusLocado"));
					System.out.println("Numero: "+rs.getInt("id"));
					veiculo.imprimeVeiculo();
				}
				System.out.print("Entre com o numero do carro que sera locado: ");
				idVeiculo=lerInt.nextInt();
				
				Locacao veiculoASerLocado = new Locacao(cpfCliente,idVeiculo);
				locarVeiculo.cadLocacao(veiculoASerLocado);
				
				
				break;
			}
		}
		
	}
}
