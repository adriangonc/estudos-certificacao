package test.polymorphism;

import java.io.IOException;

public class Test10Sub implements Itest10{

	public static void main(String[] args) {

	}
	
	public String Test() throws NullPointerException { //Colocar Exception ou uma checked exception gera erro de compila��o pois o m�todo da interface n�o gera exception. j� unchecked's como null pointer podem ser adicionadas
		return null;
	}
}
