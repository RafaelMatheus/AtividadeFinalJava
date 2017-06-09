package seguroProjetoFinal;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		Menu menu = new Menu();
		PessoaFisica fisica = new PessoaFisica();
		PessoaJuridica juridica = new PessoaJuridica();
		ContratoResidencial residencial = new ContratoResidencial();
		ContratoEmpresarial empresarial = new ContratoEmpresarial();
		TipoDeCliente cliente = new TipoDeCliente();
		TipoDeContrato contrato = new TipoDeContrato();
		Percorrer percorre = new Percorrer();
		ManipulaObjeto obj = new ManipulaObjeto();
		ArrayList<Cliente> listaCliente = new ArrayList<Cliente>();
		ArrayList<Contrato> listaContrato = new ArrayList<Contrato>();
		
		int opcMenu = -1;
		int opcMenuS = -1;
		int posCliente;
		int posContrato;
		String nomeCliente;
		String cpfContrato;
		
		while(opcMenu != 0){
			opcMenu = menu.menu();		
			
			switch(opcMenu){
			
				case 0:
					//Sair
					
					System.out.println("Saindo!");
					break;												
				case 1:
					//Cadastrar cliente
					
					listaCliente.add(cliente.TipoCliente(fisica, juridica));
					break;
				case 2:
					//Cadastrar contrato
					
					listaContrato.add(contrato.TipoContrato(residencial, empresarial));
					break;
				case 3:
					//Listar cliente
					
					percorre.percorrerLista(listaCliente, "-LISTA DE CLIENTES-", "CLIENTE ");
					break;
				case 4:
					//Listar contrato
					
					percorre.percorrerLista(listaContrato, "-LISTA DE CONTRATOS-", "CONTRATO ");
					break;
				case 5:
					//Persistencia com serializacao
					
					opcMenuS = menu.menuSerial();
					
					switch(opcMenuS){
						case 1:
							//Salvar cliente
							
							posCliente = menu.escolhaCliente(listaCliente);
							if(posCliente >= 0)
								obj.salvarObjeto(listaCliente.get(posCliente), "Cliente-" + listaCliente.get(posCliente).getNome());
							break;
						case 2:
							//Salvar contrato
							
							posContrato = menu.escolhaContrato(listaContrato);
							if(posContrato >= 0)
								obj.salvarObjeto(listaContrato.get(posContrato), "Contrato-" + listaContrato.get(posContrato).getCpf());
							break;
						case 3:
							//Ler cliente salvo
							
							ArrayList<Cliente> listCliente = new ArrayList<Cliente>();
							System.out.println("Digite o nome do cliente: ");
							nomeCliente = leitor.nextLine();
							listCliente.add(0, (Cliente)obj.lerObjeto("Cliente-" + nomeCliente));
							if(listCliente.get(0) != null)
								System.out.println("\nCLIENTE:\n" + listCliente.get(0));
							System.out.println("\nDigite qualquer coisa para voltar...");
							leitor.nextLine();
							break;
						case 4:
							//Ler contrato salvo
							
							ArrayList<Contrato> listContrato = new ArrayList<Contrato>();
							System.out.println("Digite o CPF do cliente do contrato: ");
							cpfContrato = leitor.nextLine();
							listContrato.add(0, (Contrato)obj.lerObjeto("Contrato-" + cpfContrato));
							if(listContrato.get(0) != null)
								System.out.println("\nCONTRATO:\n" + listContrato.get(0));
							System.out.println("\nDigite qualquer coisa para voltar...");
							leitor.nextLine();
							break;
						case 0:
							System.out.println("Voltando!");
							break;
						default:
							System.out.println("Valor invalido!");
							break;
					}
					break;
				default:
					System.out.println("Valor invalido!");
					break;
			}	
		}
		
		leitor.close();
	}
}
