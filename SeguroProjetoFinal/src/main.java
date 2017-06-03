import java.util.Scanner;

public class main {
	
	
	
	/**
	 * 
	 * @param opcCliente 1- Para pessoa fisica 2 - para pessoa juridica
	 */
	
	
	

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		Menu menu = new Menu();
		PessoaFisica fisica = new PessoaFisica();
		PessoaJuridica juridica = new PessoaJuridica();
		int pegaOpc;
		int pegaOpcPessoaFisicaOuJuridica;
		
		
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
				
				
				// cadastrar cliente
				
				break;
				
			case 2:
				//cadastrar contrato
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
