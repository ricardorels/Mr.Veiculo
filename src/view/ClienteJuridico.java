package view;

public class ClienteJuridico{
	public String nome;
	public String endereco;
	public String tel1;
	public String tel2;
	public String cnpj;
	public static int qtd_clientes=0;
	public Locacao[] locacoes=new Locacao[2];
	
	public ClienteJuridico(String nome_cliente, String cnpj_cliente, String end_cliente, String tel1_cliente, String tel2_cliente){
		nome=nome_cliente;
		endereco=end_cliente;
		tel1=tel1_cliente;
		tel2=tel2_cliente;
		cnpj=cnpj_cliente;
		qtd_clientes++;
	}
	
	public void imprimeClienteJuridico(){
		System.out.print("Nome: "+nome+"  ");
		System.out.println("CNPJ: "+cnpj);
		System.out.println("Endereco: "+endereco);
		System.out.print("Tel1: " +tel1+"  ");
		System.out.println("Tel2: " +tel2);
		System.out.println();
	}
	
	public static int getQtdClientes(){
		return qtd_clientes;
	}
	
	public String getCNPJ(){
		return cnpj;
	}
	
	public int qtdLocacoes(){
		return Locacao.getQtdLocacoes();
	}
	
}
