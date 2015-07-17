package view;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import dao.DAOVeiculo;
import bo.BOVeiculo;

public class ViewVeiculo {
	Veiculo v;
	public int op;
	public String marca,modelo, placa, chassi, cor;
	public int qtdPortas;
	Scanner lerInt = new Scanner(System.in);
	Scanner lerString = new Scanner(System.in);
	
	public void cadVeiculo(){
		System.out.println("Menu Veiculos:");
		System.out.println("1. Cadastrar novo veiculo.");
		System.out.println("0. Sair.");
		System.out.print("Escolha uma das opcoes: ");
		
		op=lerInt.nextInt();
		
		switch(op){
			case 1:{
				System.out.print("Marca: ");
				marca=lerString.nextLine();
				System.out.print("Modelo: ");
				modelo=lerString.nextLine();
				System.out.print("Placa: ");
				placa=lerString.nextLine();
				System.out.print("Chassi: ");
				chassi=lerString.nextLine();
				System.out.print("Cor: ");
				cor=lerString.nextLine();
				System.out.print("Quantidade de portas: ");
				qtdPortas=lerInt.nextInt();
				
				v = new Veiculo(marca,modelo,placa,chassi,cor,qtdPortas);
				
				BOVeiculo boVeiculo = new BOVeiculo();
				boVeiculo.validar_veiculo(v);
			}
		}
	}
	
	public void impVeiculos() throws SQLException{
		DAOVeiculo v= new DAOVeiculo();
		ResultSet rs = v.listarTodosOsVeiculosDoBanco("select * from veiculo");
		
		while(rs.next()){
			Veiculo veiculo = new Veiculo(rs.getString("marca"),rs.getString("modelo"),rs.getString("placa"),rs.getString("chassi"),rs.getString("cor"),rs.getInt("qtdPortas"),rs.getBoolean("statusLocado"));
			System.out.println("Numero: "+rs.getInt("id"));
			veiculo.imprimeVeiculo();
		}
	}
}
