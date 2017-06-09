package seguroProjetoFinal;

public class PessoaJuridica extends Cliente {
	private static final long serialVersionUID = 4225784973742844508L;
	private String cnpj;
	
	
	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	public String toString(){
		return "Nome: " + this.getNome() + "\nTelefone: " + this.getTelefone() + "\nCNPJ: " + this.getCnpj();
	}
}
