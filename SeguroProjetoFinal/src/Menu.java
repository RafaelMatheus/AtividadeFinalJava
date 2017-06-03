import java.io.FileNotFoundException;
import java.io.IOError;
import java.util.Scanner;

public class Menu {

	public int menu() {
		int opc = 0;
		try {
			Scanner leitor = new Scanner(System.in);

			System.out.println("1 - Cadastrar cliente ");
			System.out.println("2 - Cadastrar contrato ");
			System.out.println("3 - Listar clientes ");
			System.out.println("4 - Listar contrato ");
			System.out.println("5 - Cadastrar sinistro ");
			System.out.println("6 - Listar sinistro ");
			System.out.println("7 - Lista de contrato sem sinistro ");
			System.out.println("8 - Persistencia com serialização ");
			System.out.println("0 - Sair");
			opc = leitor.nextInt();
			return opc;

		} catch (IOError e) {
			System.out.println("");
			return 0; // erro
		}

	}

	public int menuSinistro() {
		int opc = 0;
		try {
			Scanner leitor = new Scanner(System.in);
			System.out.println("1 - Dada ");
			System.out.println("2 - Porcentagem da perca ");

			opc = leitor.nextInt();
			return opc;

		} catch (IOError e) {
			System.out.println("");
			return 0; // erro
		}

	}

}
