
public class Contrato {
	Cliente cliente;
	float valorImovel;
	int tipoContrato; // 1- residencial // 2- empresarial

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public float getValorImovel() {
		return valorImovel;
	}

	public void setValorImovel(float valorImovel) {
		this.valorImovel = valorImovel;
	}

	public int getTipoContrato() {
		return tipoContrato;
	}

	public void setTipoContrato(int tipoContrato) {
		this.tipoContrato = tipoContrato;
	}

}
