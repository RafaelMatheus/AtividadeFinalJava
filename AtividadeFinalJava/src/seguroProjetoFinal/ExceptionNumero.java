package seguroProjetoFinal;

import java.util.InputMismatchException;

public class ExceptionNumero extends InputMismatchException{
	private static final long serialVersionUID = -2490325106897997619L;
	
	public ExceptionNumero(String msg){
		super(msg);
	}
}
