package bo;
import dao.DAOVeiculo;
import view.Mensagem;
import view.Veiculo;

public class BOVeiculo {
	public void validar_veiculo(Veiculo v){
		if(v.marca.equals("") || v.modelo.equals("") || v.placa.equals("")){
			Mensagem.mensagem(2);
		}
		
		else{
			DAOVeiculo daoVeiculo = new DAOVeiculo();
			daoVeiculo.armazenarVeiculo(v);
		}
	}
}
