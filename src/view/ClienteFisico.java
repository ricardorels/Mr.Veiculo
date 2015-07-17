package view;

public class ClienteFisico{
	public String nome;
	public String endereco;
	public String tel1;
	public String tel2;
	public String cpf;
	public String rg;
	public String habilitacao;
	public static int qtd_clientes=0;
	public Locacao[] locacoes=new Locacao[3];
	
	
	public ClienteFisico(String nome_cliente, String cpf_cliente, String rg_cliente, String habilitacao_cliente, String end_cliente, String tel1_cliente, String tel2_cliente){
		nome=nome_cliente;
		endereco=end_cliente;
		tel1=tel1_cliente;
		tel2=tel2_cliente;
		cpf=cpf_cliente;
		rg=rg_cliente;
		habilitacao=habilitacao_cliente;
		qtd_clientes++;
	}
	
	public void imprimeClienteFisico(){
		System.out.println("Nome: "+nome);
		System.out.print("CPF: "+cpf+"  ");
		System.out.print("RG: "+rg+"  ");
		System.out.println("Habilitacao: "+habilitacao);
		System.out.println("Endereco: "+endereco);
		System.out.print("Telefone 1: "+tel1+"  ");
		System.out.println("Telefone 2: "+tel2);
		System.out.println();
	}
	
	public static int getQtdClientes(){
		return qtd_clientes;
	}
	
	public String getHabilitacao(){
		return habilitacao; 
	}
	
	//public void locarVeiculo(String placa_veiculo){
		//locacoes[Locacao.getQtdLocacoes()]=new Locacao(placa_veiculo);
	//}
	
	public int qtdLocacoes(){
		return Locacao.getQtdLocacoes();
	}

}
