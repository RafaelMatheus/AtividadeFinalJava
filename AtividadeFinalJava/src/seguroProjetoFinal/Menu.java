package seguroProjetoFinal;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {
	Scanner leitor = new Scanner(System.in);
	
	public int menu() {
		int opc = 0;
		
		try{
			System.out.println("--------MENU--------");
			System.out.println("1 - Cadastrar cliente ");
			System.out.println("2 - Cadastrar contrato ");
			System.out.println("3 - Listar clientes ");
			System.out.println("4 - Listar contrato ");
			System.out.println("5 - Persistencia com serializacao ");
			System.out.println("0 - Sair");
			opc = leitor.nextInt();
				
			return opc;
		}catch(InputMismatchException e){
			opc = -1;
			leitor.nextLine();
			return opc;
		}
	}

	public int menuSerial() {
		int opc = 0;
		
		try{
			System.out.println("------MENU SERIALIZACAO------");
			System.out.println("1 - Salvar Cliente");
			System.out.println("2 - Salvar Contrato");
			System.out.println("3 - Ler Cliente Salvo");
			System.out.println("4 - Ler Contrato Salvo");
			System.out.println("0 - Voltar");
			opc = leitor.nextInt();
			
			return opc;
		}catch(InputMismatchException e){
			opc = -1;
			leitor.nextLine();
			return opc;
		}
	}
	
	public int escolhaCliente(ArrayList<Cliente> list){
		int posicao = 0;
		int tam;
		
		if(list.size() == 0){
			System.out.println("Nao ha clientes cadastrados!");
			return -1;
		}
		else{
			tam = list.size();
			do{
				try{
					System.out.println("Digite o numero do cliente que voce deseja salvar: ");
					posicao = leitor.nextInt();
				}catch(InputMismatchException e){
					posicao = 0;
					System.out.println("Valor invalido!");
				}
				if(posicao <= 0 || posicao > tam)
					System.out.println("Digite um numero de cliente existente!");
				leitor.nextLine();
			}while(posicao <= 0 || posicao > tam);
			
			return posicao-1;
		}
	}
	
	public int escolhaContrato(ArrayList<Contrato> list){
		int posicao = 0;
		int tam;
		
		if(list.size() == 0){
			System.out.println("Nao ha contratos cadastrados!");
			return -1;
		}
		else{
			tam = list.size();
			do{
				try{
					System.out.println("Digite o numero do contrato que voce deseja salvar: ");
					posicao = leitor.nextInt();
				}catch(InputMismatchException e){
					posicao = 0;
					System.out.println("Valor invalido!");
				}
				if(posicao <= 0 || posicao > tam)
					System.out.println("Digite um numero de contrato existente!");
				leitor.nextLine();
			}while(posicao <= 0 || posicao > tam);
			
			return posicao-1;
		}
	}
	
}
