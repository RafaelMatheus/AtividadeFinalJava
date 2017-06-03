
public class ContratoResidencial  {
	Contrato contrato;
	String endereco;
	int zonaImovel; // 1 - Urbana 2 - Suburbana 3- rural
	
	int tipoResidencia; // guarda o tipo de residencia, 1- se casa, 2- se
						// apartamento

	float valorSinistro = 0.0f;
	
	
	
	public void calcularSeguroResidencial(CalcularSeguro residencial){
		valorSinistro = residencial.totalFinal;
		
		
	}

	
	
	
	
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

}
