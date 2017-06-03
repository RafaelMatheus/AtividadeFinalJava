import java.io.IOError;

public class CalcularSeguro {
	private float totalFinal = 0.0f; 
	
	
	/**
	 * Recebe o valor Final da soma das porcentagens calculada pela função calcularSeguroResidencial
	 */

	/**
	 * 
	 * @param contrato Recebe o contrato 
	 * @param empresa recebe um tipo de contrato empresarial 
	 * @return retorna 0 caso não tenha acontecido nenhum problema ao longo da execução do programa 
	 * 
	 * essa função seta na variavel float totalFinal o valor total da soma das porcentagens 
	 */
	
	
	public int calcularSeguroResidencial (Contrato contrato, ContratoResidencial residencial) {
		
		float valorSeguro = 0.0f;
		try{
			
		if(contrato.getTipoContrato() == 1){
			
			
			// Caso seja um contrato residencial o programa vai entrar no escopo desse if
			
			float total = (float) (0.02*contrato.getValorImovel()); 	
			
			
			/**
			 * A variavel total armazena o valor de 2 porcento calculada em cima do valor total do imovel 
			 */
			
			
			
			if(residencial.getZonaImovel() == 1){
				//Urbana 
				
				
				/**
				 * Caso for urbana vai entrar nesse if realizar o calculo em cima de mais 1 porcento do valor
				 * do imovel, e colocar na variavel totalFinal inicializada no inicio do escopo da classe 
				 */
			
				float totalUrbana = (float) (contrato.valorImovel * 0.01);
				this.totalFinal = totalUrbana + total; 
				
				
			}
			
			else if(contrato.getTipoContrato() == 2 || contrato.getTipoContrato() == 3){
				//Suburbana
				
				/**
				 * Caso suburbana ou rural vai entrar nesse else if 
				 * calcular 5 porcento do do valor total e soma ao anterior 
				 * que ficou na variavel total
				 *  
				 */
				
				
				float totalRural = (float) (contrato.getValorImovel() * 0.05 );
				this.totalFinal = (totalRural + total); // coloca o valor final do calculo dentro da variavel 
				//total final, no inicio do escopo da classe								
			}
			
			
		}
	
				
		}catch(IOError e){
			System.out.println("");
		}
		
		return 0;

		}
	
	
	
	
	/**
	 * 
	 * @param contrato Uma variavel do tipo contrato
	 * @param empresa uma variavel do tipo ContratoEmpresarial
	 * @return retorna 0 caso tenha ocorrido tudo bem
	 */
	
	
	
	
	public int calcularSeguroEmpresarial(Contrato contrato, ContratoEmpresarial empresa ){
		
		try{
		
		if(contrato.getTipoContrato() == 2){			
			//empresarial
			
			float valorImovel = (float) (contrato.getValorImovel() * 0.04); // guarda 4 porcento do valor total do imovel 
			float valorFinalImovel = 0.0f;
			float valorFuncionarios  = 0.0f; // guarda a soma dos valores entre funcionarios e visitas 
			float valorVisitas = 0.0f;
			
			
			for(int contador = 0; contador <= empresa.qntFuncionarios; contador ++){
				if((empresa.qntFuncionarios % 10) == 0){
					
					valorFuncionarios += (float) (contrato.getValorImovel() * 0.02);
				}
				
			}
			
			
			for(int contador = 0; contador <= empresa.qntVisitasDiaria; contador++){
				/**
				 * No for vai até a quantidade de visitas diaria 
				 * testando quando a divisão inteira de visitas diaria por 200 for igual 0
				 * vai entrar no if e realizar o calculo
				 * 
				 */
				
				
				if((empresa.qntVisitasDiaria % 200) == 0){
					valorVisitas += (float) (contrato.getValorImovel() * 0.03);
					
				}
				
			}
			
			if(empresa.ramo == 1){
				// 1 comercio, 2 - industria 3 - agropecuaria 
				
				float valorComercio = (float) (contrato.getValorImovel() * 0.05);
				/**
				 * valorFinalImovel guarda a soma de toda porcentagem
				 */
				
				valorFinalImovel = (valorComercio + valorVisitas + valorFuncionarios);
				this.totalFinal = valorFinalImovel;
				
			}
			
			else if(empresa.ramo == 2){
				float valorIndustria = (float) (contrato.getValorImovel() * 0.01);
				
				valorFinalImovel = valorIndustria + valorVisitas + valorFuncionarios;
				
				this.totalFinal = valorFinalImovel;
			}
			
			else{
				System.out.println("Informe um valor valido: ");
			}
			
		
		
		}
		
		}catch(IOError e){
			System.out.println("");
		}
		return 0;
	}

}
