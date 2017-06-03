import java.util.Scanner;

/**
 * 
 * @author Rafael, Arthur e Matheus 
 *
 */

// Essa classe é responsavel por validar o cliente e salvar 


public class TipoDeCliente {
	Scanner leitor = new Scanner(System.in);
	/**
	 * 
	 * @param opcCliente 1- Para pessoa fisica 2 - para pessoa juridica
	 */
	
	
	
	
	
	public void Cliente (int opcCliente){
		
		switch(opcCliente){
		
		case 1:
			PessoaFisica fisica = new PessoaFisica();
			
			System.out.println("Informe seu nome: ");
			fisica.nome = leitor.nextLine();
			
			System.out.println("Informe seu telefone: ");
			fisica.nome = leitor.nextLine();
			
			
			System.out.println("Informe seu CPF: ");
			fisica.cpf = leitor.nextLine();
			break;
			
			
			
		case 2:
			
			PessoaJuridica juridica = new PessoaJuridica();
			
			System.out.println("Informe seu nome: ");
			juridica.nome = leitor.nextLine();
			
			System.out.println("Informe seu telefone: ");
			juridica.nome = leitor.nextLine();
			
			
			System.out.println("Informe seu CNPJ: ");
			juridica.cnpj = leitor.nextLine();
			break;
			
		}
			
		
		
		
	}
	

}
