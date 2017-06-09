package seguroProjetoFinal;

public class PessoaFisica extends Cliente {
	private static final long serialVersionUID = -848829532034724318L;
	private String cpf;
	
	
	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public String toString(){
		return "Nome: " + this.getNome() + "\nTelefone: " + this.getTelefone() + "\nCPF: " + this.getCpf();
	}
}
