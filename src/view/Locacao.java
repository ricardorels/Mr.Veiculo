package view;

public class Locacao {
	public String codCliente;
	//public String data_de_locacao;
	public int idVeiculo;
	public static int qtd_locacoes=0;
	
	public Locacao(String cod_cliente, int id_veiculo){
		codCliente = cod_cliente;
		idVeiculo=id_veiculo;
		qtd_locacoes++;
	}
	
	public static int getQtdLocacoes(){
		return qtd_locacoes;
	}
}
