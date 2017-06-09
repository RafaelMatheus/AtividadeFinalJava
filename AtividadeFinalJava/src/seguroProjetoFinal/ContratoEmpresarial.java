package seguroProjetoFinal;

public class ContratoEmpresarial extends Contrato {
	private static final long serialVersionUID = 3500706207205185263L;
	private int qntFuncionarios;
	private int qntVisitasDiaria;
	private int ramo; // 1 - comercio 2 - industria 3 - agropecuaria
	
	
	public int getQntFuncionarios() {
		return qntFuncionarios;
	}
	public void setQntFuncionarios(int qntFuncionarios) {
		this.qntFuncionarios = qntFuncionarios;
	}
	public int getQntVisitasDiaria() {
		return qntVisitasDiaria;
	}
	public void setQntVisitasDiaria(int qntVisitasDiaria) {
		this.qntVisitasDiaria = qntVisitasDiaria;
	}
	public int getRamo() {
		return ramo;
	}
	public void setRamo(int ramo) {
		this.ramo = ramo;
	}
	
	
	public String toString(){
		return "Nome: " + this.getNome() + "\nCPF: " + this.getCpf() + "\nValor Imovel: " + this.getValorImovel() + " Reais" + "\nTipo de Contrato: " + this.getTipoContrato()
		+ "\nQuantidade de Funcionarios: " + this.getQntFuncionarios() + "\nQuantidade de Visitas: " + this.getQntVisitasDiaria()
		+ "\nRamo: " + this.getRamo() + "\nSeguro: " + this.getSeguro() + " Reais" + "\nData: " + this.getData() + "\nSinistro: " + this.getSinistro()
		+ "%";
	}
}
