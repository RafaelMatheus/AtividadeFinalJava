import java.util.ArrayList;
import java.util.Scanner;

public class main {
	
	
	
	/**
	 * 
	 * @param opcCliente 1 - Para pessoa fisica 2 - para pessoa juridica
	 */
	
	
	

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		Menu menu = new Menu();
		PessoaFisica fisica = new PessoaFisica();
		ArrayList<PessoaFisica> pessoaFisica = new ArrayList<>();
		PessoaJuridica juridica = new PessoaJuridica();
		ContratoResidencial residencial = new ContratoResidencial();
		ContratoEmpresarial empresarial = new ContratoEmpresarial();
		
		int pegaOpc;
		int pegaOpcPessoaFisicaOuJuridica;
		int pegaOpcTipoContrato = 0;
		
		
		do{
			pegaOpc =  menu.menu();		
			switch(pegaOpc){
			
			case 0:
				//sair
				break;												
			case 1:
				
				
				do{
				
					System.out.println("Digite 1 - para pessoa fisica 2 - pessoa juridica:  ");
					pegaOpcPessoaFisicaOuJuridica = leitor.nextInt();
				
				if(pegaOpcPessoaFisicaOuJuridica == 1){
					
					System.out.print("Digite seu nome: ");
					fisica.nome = leitor.nextLine();
					
					System.out.println();
					
					System.out.print("Digite seu telefone: ");
					fisica.telefone = leitor.nextLine();
					System.out.println();
					
					System.out.print("Digite seu CPF: ");
					fisica.cpf = leitor.nextLine();
					
					pessoaFisica.add(fisica);
					
		
				}
				
				else if(pegaOpcPessoaFisicaOuJuridica == 2){
					
					System.out.println("Digite seu nome: ");
					juridica .nome = leitor.nextLine();
					System.out.println();
					
					System.out.println("Digite seu telefone: ");
					juridica .telefone = leitor.nextLine();
					System.out.println();
					
					System.out.println("Digite seu CPF: ");
					juridica.cnpj = leitor.nextLine();
					
				}
			
				
				}while(pegaOpcPessoaFisicaOuJuridica != 2 || pegaOpcPessoaFisicaOuJuridica != 1);
								break;
				
							
								
								
								
			case 2:
				//cadastrar contrato
				
				
				do{
					/**
					 * O primeiro do while vai rodar até que o valor informado seja o numero 1 ou o numero 2
					 */
					
					
					System.out.println("Digite 1 - para contrato residencial 2 - para empresarial:  ");
					pegaOpcTipoContrato = leitor.nextInt();				
					
					
					
					if(pegaOpcTipoContrato == 1){
						
						residencial.endereco = leitor.nextLine();
						
						System.out.println("Informe seu endereco: ");
						residencial.endereco = leitor.nextLine();
						
						System.out.println("Informe o valor do seu imovel: ");
						residencial.contrato.valorImovel = leitor.nextFloat();
						
						
						
						/**
						 * esse do while vai rodar até que o valor informado do tipo de residencia seja 1 ou 2
						 */
						
						
						do{
						System.out.println("Informe o tipo de residencia 1 - casa  2 - apartamento: ");
						residencial.tipoResidencia = leitor.nextInt();
						
						
						if(residencial.tipoResidencia != 1 || residencial.tipoResidencia !=2){
							System.out.println("Informe um valor valido");
						}
						
						
						
						}while(residencial.tipoResidencia  != 1 || residencial.tipoResidencia != 2);
									
						/**
						 * esse do while vai rodar até que o valor seja 1, 2 ou 3
						 */
						
						
						
						do{
							System.out.println("Informe a zona do seu imovel 1 - urbana 2 - suburbana 3 - rural: ");
							residencial.zonaImovel = leitor.nextInt();
							
							if(residencial.zonaImovel != 1 || residencial.zonaImovel != 2 || residencial.zonaImovel != 3){
								System.out.println("Informe um valor valido");
							}
							
							
						}while(residencial.zonaImovel != 1 || residencial.zonaImovel != 2 || residencial.zonaImovel != 3);
						
						
					}
					
					
					
					
					
					
					
					else if(pegaOpcTipoContrato == 2){
						
						System.out.println("Informe o seu nome: ");
						empresarial.cliente.nome = leitor.nextLine();
						
						
						System.out.println("Valor do imovel: ");
						empresarial.valorImovel = leitor.nextFloat();
						
						System.out.println("Numero de funcionarios: ");
						empresarial.qntFuncionarios = leitor.nextInt();
						
						System.out.println("Numero de visitas diarias: ");
						empresarial.qntVisitasDiaria = leitor.nextInt();
						
						
						do{
						System.out.println("ramo 1 - comercio 2 - industria  3 - agropecuaria: ");
						empresarial.ramo = leitor.nextInt();
						
						}while(empresarial.ramo != 1 || empresarial.ramo != 2 || empresarial.ramo != 3);
						
					}
				
					
					
				}while(pegaOpcTipoContrato != 1 || pegaOpcTipoContrato !=2);
				
				break;
				
				
				
			case 3:
				
				//listar cliente
				break;
				
				
			case 4:
				// listar contrato
				break;
				
				
			case 5:
				
				//cadastrar sinistro
				break;
				
				
			case 6:
				//listar sinistro
				break;
				
				
			case 7:
				// listar contrato sem sinistro
				break;
			
				
			case 8:
				//persistencia com serialização
				break;
				
			
				
			}
			
			
			
			
			
		}while(pegaOpc != 0);
		

	}

}
