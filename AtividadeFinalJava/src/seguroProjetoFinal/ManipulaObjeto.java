package seguroProjetoFinal;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class ManipulaObjeto {
	
	public void salvarObjeto(Serializable serializable, String nome){
		
		try {
			FileOutputStream fos = new FileOutputStream(nome);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(serializable);
			oos.close();
			fos.close();
		} catch (FileNotFoundException e) {
			System.out.println("Nao existe!");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public Object lerObjeto(String nome){
		
			try {
				FileInputStream fis = new FileInputStream(nome);
				ObjectInputStream ois = new ObjectInputStream(fis);
				Object objeto = ois.readObject();
				ois.close();
				fis.close();
				return objeto;
			} catch (FileNotFoundException e) {
				System.out.println("Nao existe!");
				return null;
			} catch (IOException e) {
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
		
		return null;
	}
}
