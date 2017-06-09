package seguroProjetoFinal;

import java.util.ArrayList;
import java.util.Scanner;

public class Percorrer {
	Scanner leitor = new Scanner(System.in);
	
	public void percorrerLista(ArrayList<?> list, String tituloLista, String nomeLista){
		int i;
		int tam;
		
		tam = list.size();
		
		System.out.println(tituloLista);
		
		for(i = 0; i < tam; i++){
			System.out.println("\n" + nomeLista + (i+1) + ":");
			System.out.println(list.get(i));
		}
		System.out.println("\nDigite qualquer coisa para voltar...");
		leitor.nextLine();
	}
}
