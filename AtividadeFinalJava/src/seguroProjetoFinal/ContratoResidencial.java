package seguroProjetoFinal;

public class ContratoResidencial extends Contrato {
	private static final long serialVersionUID = 7771313398655658655L;
	Contrato contrato;
	private String endereco;
	private int zonaImovel; // 1 - Urbana 2 - Suburbana 3- rural
	private int tipoResidencia; // guarda o tipo de residencia, 1- se casa, 2- se apartamento
	
	
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public int getZonaImovel() {
		return zonaImovel;
	}
	public void setZonaImovel(int zonaImovel) {
		this.zonaImovel = zonaImovel;
	}
	public int getTipoResidencia() {
		return tipoResidencia;
	}
	public void setTipoResidencia(int tipoResidencia) {
		this.tipoResidencia = tipoResidencia;
	}
	
	
	public String toString(){
		return "Nome: " + this.getNome() + "\nCPF: " + this.getCpf() + "\nValor Imovel: " + this.getValorImovel() + " Reais"
		+ "\nTipo de Contrato: " + this.getTipoContrato()
		+ "\nEndereco: " + this.getEndereco() + "\nZona: " + this.getZonaImovel() + "\nTipo de Residencia: "
		+ this.getTipoResidencia() + "\nSeguro: " + this.getSeguro() + " Reais" + "\nData: " + this.getData() + "\nSinistro: " + this.getSinistro()
		+ "%";
	}
}
