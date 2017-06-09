package seguroProjetoFinal;

import java.io.Serializable;

public class Contrato implements Serializable{
	private static final long serialVersionUID = 2L;
	private String nome;
	private String cpf;
	private float valorImovel;
	private float seguro;
	private int tipoContrato; // 1- residencial // 2- empresarial
	private String data;
	private float Sinistro;
	

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
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public float getSeguro() {
		return seguro;
	}
	public void setSeguro(float seguro) {
		this.seguro = seguro;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public float getSinistro() {
		return Sinistro;
	}
	public void setSinistro(float sinistro) {
		Sinistro = sinistro;
	}
	
}
