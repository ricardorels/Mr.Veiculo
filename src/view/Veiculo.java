package view;

public class Veiculo {
	public String marca;
	public String modelo;
	public String placa;
	public String chassi;
	public String cor;
	public int qtdPortas;
	public static int qtd_veiculos=0;
	public boolean status_locado;
	
	public Veiculo(String marca_veiculo, String modelo_veiculo, String placa_veiculo, String chassi_veiculo, String cor_veiculo, int qtd_portas){
		marca=marca_veiculo;
		modelo=modelo_veiculo;
		placa=placa_veiculo;
		chassi=chassi_veiculo;
		cor=cor_veiculo;
		qtdPortas=qtd_portas;
		qtd_veiculos++;
	}
	
	public Veiculo(String marca_veiculo, String modelo_veiculo, String placa_veiculo, String chassi_veiculo, String cor_veiculo, int qtd_portas, boolean statusLocado){
		marca=marca_veiculo;
		modelo=modelo_veiculo;
		placa=placa_veiculo;
		chassi=chassi_veiculo;
		cor=cor_veiculo;
		qtdPortas=qtd_portas;
		status_locado=statusLocado;
		qtd_veiculos++;
	}
	
	public static int getQtdVeiculos(){
		return qtd_veiculos;
	}
	
	public boolean getStatusLocacao(){
		return status_locado;
	}
	
	public boolean verificaPlaca(String placa_fornecida){
		if(placa_fornecida.equals(placa))
			return true;
		
		else
			return false;
	}
	
	public void imprimeVeiculo(){
		System.out.print("Marca: "+marca+" - ");
		System.out.println("Modelo: "+modelo);
		System.out.print("Placa: "+placa+" - ");
		System.out.println("Chassi: "+chassi);
		System.out.print("Cor: "+cor+" - ");
		System.out.println("Quantidade de portas: "+qtdPortas);
		
		if(status_locado==true)
			System.out.println("Status de locacao: O veiculo ja esta locado!\n");
		
		else
			System.out.println("Status de locacao: O veiculo esta disponivel para ser locado!\n");
	}
	
	public void mudarStatus(){
		if(status_locado==true)
			status_locado=false;
		
		else
			status_locado=true;
	}
}
