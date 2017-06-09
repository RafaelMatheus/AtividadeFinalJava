package seguroProjetoFinal;

import java.text.DateFormat;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TipoDeContrato {
	Scanner leitor = new Scanner(System.in);
	
	
	public Contrato TipoContrato(ContratoResidencial residencial, ContratoEmpresarial empresarial){
		int opc1 = 0;
		int opc2 = 0;
		int opc3 = 0;
		String opc;
		
		
		do{
			try{
				System.out.println("Digite 1 - Para Contrato Residencial ou 2 - Para Empresarial:  ");
				opc = leitor.nextLine();
				char[] c = opc.toCharArray();
				if(!Character.isDigit(c[0]))
					throw new ExceptionNumero("Digite um numero!");	
				opc1 = (int) c[0] - '0';
			}catch(ExceptionNumero e){
				opc1 = 0;
				System.out.println("Valor invalido!");
			}catch(Exception ex){
				opc1 = 0;
			}
		}while(opc1 <= 0 || opc1 > 2);
		
		switch(opc1){
		
			case 1:
				//Contrato residencial
				CalculoSeguro calculoR = new CalculoSeguro();
				float valorIR = 0.0f;
				
				residencial.setTipoContrato(opc1);
				
				System.out.println("Informe seu nome: ");
				residencial.setNome(leitor.nextLine());
				
				System.out.println("Informe seu CPF: ");
				residencial.setCpf(leitor.nextLine());
				
				System.out.println("Informe seu endereco: ");
				residencial.setEndereco(leitor.nextLine());
				
				do{
					try{
						System.out.println("Informe o valor do seu imovel: ");
						valorIR = leitor.nextFloat();
					}catch(InputMismatchException e){
						valorIR = 0.0f;
						System.out.println("Valor invalido!");
					}
					if(valorIR <= 0)
						System.out.println("Digite um valor acima de '0'");
					leitor.nextLine();
				}while(valorIR <= 0.0f);
				
				residencial.setValorImovel(valorIR);
					
				do{
					try{
						System.out.println("Informe o tipo de residencia, 1 - Casa, 2 - Apartamento: ");
						opc2 = leitor.nextInt();
					}catch(InputMismatchException e){
						opc2 = 0;
						System.out.println("Valor invalido!");
					}
					if(opc2 > 2)
						System.out.println("Digite o valor de acordo com as opcoes!");
					leitor.nextLine();
				}while(opc2 <= 0 || opc2 > 2);
				
				residencial.setTipoResidencia(opc2);
				
				do{
					try{
						System.out.println("Informe a zona do seu imovel, 1 - Urbana, 2 - Suburbana, 3 - Rural: ");
						opc3 = leitor.nextInt();
					}catch(InputMismatchException e){
						opc3 = 0;
						System.out.println("Valor invalido!");
					}
					if(opc3 > 3)
						System.out.println("Digite o valor de acordo com as opcoes!");
					leitor.nextLine();
				}while(opc3 <= 0 || opc3 > 3);
				
				residencial.setZonaImovel(opc3);
				
				residencial.setSeguro(calculoR.SeguroResidencial(residencial));
				
				java.util.Date d = new Date();
				residencial.setData(java.text.DateFormat.getDateInstance(DateFormat.MEDIUM).format(d));
				
				residencial.setSinistro((residencial.getSeguro() * 100) / residencial.getValorImovel());
				return residencial;
			case 2:
				//Contrato empresarial
				CalculoSeguro calculoE = new CalculoSeguro();
				float valorIE = 0.0f;
				int numF = -1;
				int numV = -1;
				
				empresarial.setTipoContrato(opc1);
				
				System.out.println("Informe seu nome: ");
				empresarial.setNome(leitor.nextLine());
				
				System.out.println("Informe seu CPF: ");
				empresarial.setCpf(leitor.nextLine());
				
				do{
					try{
						System.out.println("Valor do imovel: ");
						valorIE = leitor.nextFloat();
						System.out.println("Numero de funcionarios: ");
						numF = leitor.nextInt();
						System.out.println("Numero de visitas diarias: ");
						numV = leitor.nextInt();
					}catch(InputMismatchException e){
						valorIE = 0.0f;
						numF = 0;
						numV = 0;
						System.out.println("Valor invalido!");
					}
					if(valorIE <= 0 || numF <= 0 || numV <= 0)
						System.out.println("Digite um valor acima de '0' para todos com campos!");
					leitor.nextLine();
				}while(valorIE <= 0.0f || numF <= 0 || numV <= 0);
				
				empresarial.setValorImovel(valorIE);
				empresarial.setQntFuncionarios(numF);
				empresarial.setQntVisitasDiaria(numV);
				
				do{
					try{
						System.out.println("Ramo 1 - Comercio, 2 - Industria, 3 - Agropecuaria: ");
						opc2 = leitor.nextInt();
					}catch(InputMismatchException e){
						opc2 = 0;
						System.out.println("Valor invalido!");
					}
					if(opc2 > 3)
						System.out.println("Digite o valor de acordo com as opcoes!");
					leitor.nextLine();
				}while(opc2 <= 0 || opc2 > 3);
				
				empresarial.setRamo(opc2);
				
				empresarial.setSeguro(calculoE.SeguroEmpresarial(empresarial));
				
				java.util.Date da = new Date();
				empresarial.setData(java.text.DateFormat.getDateInstance(DateFormat.MEDIUM).format(da));
				
				empresarial.setSinistro((empresarial.getSeguro() * 100) / empresarial.getValorImovel());
				return empresarial;
			default:
				System.out.println("Valor incorreto! Digite de novo!");
				break;
		}
		return null;
	}
}
