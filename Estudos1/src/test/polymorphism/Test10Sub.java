package test.polymorphism;

import java.io.IOException;

public class Test10Sub implements Itest10{

	public static void main(String[] args) {

	}
	
	public String Test() throws NullPointerException { //Colocar Exception ou uma checked exception gera erro de compilação pois o método da interface não gera exception. já unchecked's como null pointer podem ser adicionadas
		return null;
	}
}
