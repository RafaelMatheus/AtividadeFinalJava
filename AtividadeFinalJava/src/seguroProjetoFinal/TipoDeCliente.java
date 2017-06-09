package seguroProjetoFinal;

import java.util.Scanner;

/**
 * 
 * @author Rafael, Arthur e Matheus 
 *
 */

//Essa classe e responsavel por validar o cliente e salvar

public class TipoDeCliente {
	Scanner leitor = new Scanner(System.in);
	
	/**
	 * @param opcCliente 1- Para pessoa fisica 2 - para pessoa juridica
	 * 
	 */
	
	public Cliente TipoCliente(PessoaFisica fisica, PessoaJuridica juridica){
		int opc = 0;
		String opc1;
		
		
		do{
			try{
				System.out.println("Digite 1 - Para Pessoa Fisica, 2 - Pessoa Juridica:  ");
				opc1 = leitor.nextLine();
				char[] c = opc1.toCharArray();
				if(!Character.isDigit(c[0]))
					throw new ExceptionNumero("Digite um numero!");	
				opc = (int) c[0] - '0';
			}catch(ExceptionNumero e){
				opc = 0;
				System.out.println("Valor invalido!");
			}catch(Exception ex){
				opc = 0;
			}
		}while(opc <= 0 || opc > 2);
		
		
		switch(opc){
		
			case 1:
				//Cadastar pessoa fisica
				
									
				System.out.println("Informe seu nome: ");
				fisica.setNome(leitor.nextLine());
					
				System.out.println("Informe seu telefone: ");
				fisica.setTelefone(leitor.nextLine());
					
				System.out.println("Informe seu CPF: ");
				fisica.setCpf(leitor.nextLine());
				
				return fisica;
			case 2:
				//Cadastrar pessoa juridica
				
				System.out.println("Informe seu nome: ");
				juridica.setNome(leitor.nextLine());
				
				System.out.println("Informe seu telefone: ");
				juridica.setTelefone(leitor.nextLine());
				
				System.out.println("Informe seu CNPJ: ");
				juridica.setCnpj(leitor.nextLine());
				return juridica;
			default:
				System.out.println("Valor incorreto! Digite de novo!");
				break;
		}
		return null;
	}

}
