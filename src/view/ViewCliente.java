package view;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
import dao.DAOCliente;
import bo.BOCliente;

public class ViewCliente {
	public int op;
	Scanner lerInt=new Scanner(System.in);
	Scanner lerString=new Scanner(System.in);
	ClienteFisico fis;
	ClienteJuridico jur;
	
	public void cadCliente(){
		
		do{
			System.out.println("Menu Cliente");
			System.out.println("1. Cadastrar cliente fisico");
			System.out.println("2. Cadastrar cliente juridico");
			System.out.println("0. Sair");
			System.out.print("Entre com uma opcao (0 para sair): ");
			op=lerInt.nextInt();
			
			switch(op){
				case 1:{
					String nome,rg,cpf,hab,end,tel1,tel2;
					
					System.out.println("Entre com o nome: ");
					nome=lerString.nextLine();
					System.out.println("Entre com o CPF: ");
					cpf=lerString.nextLine();
					System.out.println("Entre com o RG: ");
					rg=lerString.nextLine();
					System.out.println("Entre com o Habilitacao: ");
					hab=lerString.nextLine();
					System.out.println("Entre com o Endereco: ");
					end=lerString.nextLine();
					System.out.println("Entre com o Telefone 1: ");
					tel1=lerString.nextLine();
					System.out.println("Entre com o Telefone 2: ");
					tel2=lerString.nextLine();
					
					fis=new ClienteFisico(nome,cpf,rg,hab,end,tel1,tel2);
					BOCliente boCliente = new BOCliente();
					boCliente.validar_clienteFisico(fis);
					break;
				}
				
				case 2:{
					String nome, cnpj, end, tel1, tel2;
					
					System.out.println("Entre com o nome: ");
					nome=lerString.nextLine();
					System.out.println("Entre com o CNPJ: ");
					cnpj=lerString.nextLine();
					System.out.println("Entre com o Endereco: ");
					end=lerString.nextLine();
					System.out.println("Entre com o Telefone 1: ");
					tel1=lerString.nextLine();
					System.out.println("Entre com o Telefone 2: ");
					tel2=lerString.nextLine();
			
					jur= new ClienteJuridico(nome,cnpj,end,tel1,tel2);
					BOCliente boCliente= new BOCliente();
					boCliente.validar_clienteJuridico(jur);
				}
			}
			
		}while(op!=0);
	}
	
	public void impClientes() throws SQLException{
		System.out.println("Sub-menu:");
		System.out.println("1. Listar clientes fisicos.");
		System.out.println("2. Listar clientes juridicos.");
		System.out.print("Escolha uma das opcoes: ");
		
		op=lerInt.nextInt();
		
		switch(op){
			case 1:{
				DAOCliente c= new DAOCliente();
				ResultSet rs = c.listarClientesFisicos("select * from clientefisico");
				
				while(rs.next()){
					ClienteFisico cliente = new ClienteFisico(rs.getString("nome"),rs.getString("cpf"),rs.getString("rg"),rs.getString("habilitacao"),rs.getString("endereco"),rs.getString("tel1"),rs.getString("tel2"));
					cliente.imprimeClienteFisico();
				}
				break;
			}
			
			case 2:{
				DAOCliente c= new DAOCliente();
				ResultSet rs = c.listarClientesJuridicos("select * from clientejuridico");
				
				while(rs.next()){
					ClienteJuridico cliente = new ClienteJuridico(rs.getString("nome"),rs.getString("cnpj"),rs.getString("endereco"),rs.getString("tel1"),rs.getString("tel2"));
					cliente.imprimeClienteJuridico();
				}
				break;
			}
		}
		
	}
	
}
