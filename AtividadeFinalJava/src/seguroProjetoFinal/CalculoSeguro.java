package seguroProjetoFinal;

public class CalculoSeguro {
	
	
	public float SeguroResidencial(ContratoResidencial residencial){
		float valorImovel = residencial.getValorImovel();
		float valorSomar = 0;
		
		valorSomar += (2 * valorImovel) / 100;
		
		if(residencial.getZonaImovel() == 1)
			valorSomar += (1 * valorImovel) / 100;
		else if(residencial.getZonaImovel() == 2)
			valorSomar += (0.5 * valorImovel) / 100;
		
		if(residencial.getTipoResidencia() == 1)
			valorSomar += (0.5 * valorImovel) / 100;
		
		return valorSomar;
	}
	
	public float SeguroEmpresarial(ContratoEmpresarial empresarial){
		float valorImovel = empresarial.getValorImovel();
		float valorSomar = 0;
		float porce = 0;
		int cast;
		
		valorSomar += (4 * valorImovel) / 100;
		
		if((empresarial.getQntFuncionarios() / 10) >= 1){
			porce = empresarial.getQntFuncionarios() / 10;
			cast = (int) porce;
			valorSomar += ((cast * 0.2) * valorImovel) / 100;
		}
		
		if((empresarial.getQntVisitasDiaria() / 200) >= 1){
			porce = 0;
			cast = 0;
			porce = empresarial.getQntVisitasDiaria() / 200;
			cast = (int) porce;
			valorSomar += ((cast * 0.3) * valorImovel) / 100;
		}
		
		if(empresarial.getRamo() == 1)
			valorSomar += (0.5 * valorImovel) / 100;
		else if(empresarial.getRamo() == 2)
			valorSomar += (1 * valorImovel) / 100;
		
		
		return valorSomar;
	}
}
