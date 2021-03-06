package bo;
import view.ClienteFisico;
import view.ClienteJuridico;
import view.Mensagem;
import dao.DAOCliente;

public class BOCliente {
	
	public void validar_clienteFisico(ClienteFisico fis){
		if(fis.nome.equals("") || fis.cpf.equals("") || fis.habilitacao.equals("") || fis.tel1.equals("") || fis.endereco.equals("")){
			Mensagem.mensagem(2);
		}
		
		else{
			DAOCliente daoCliente = new DAOCliente();
			daoCliente.armazenarClienteFisico(fis);
		}
	}
	
	public void validar_clienteJuridico(ClienteJuridico jur){
		if(jur.nome.equals("") || jur.cnpj.equals("") || jur.endereco.equals("") || jur.tel1.equals("")){
			Mensagem.mensagem(2);
		}
		
		else{
			DAOCliente daoCliente = new DAOCliente();
			daoCliente.armazenarClienteJuridico(jur);
		}
	}
}

