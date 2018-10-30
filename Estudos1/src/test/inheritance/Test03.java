package test.inheritance;

import test.loops.Loops;

public class Test03 {

	public static void main(String[] args) {
		Atest at = new Btest();
		at.method(); //Chama o método de A pois este e estático que não e herdado pelas sub classes, estes são somente acessíveis para as classes filhas.
		Atest.method();
		
		Btest b = new Btest();
		b.method(); //Chama o método de B
	}

}

class Atest extends Loops{
	static void method(){
		Character c = new Character('a'); //Só aceita char
		System.out.println("A");
	}
}

class Btest extends Atest{
	static void method(){ //E obrigatório que métodos tenham um tipo, mesmo que seja void
		System.out.println("B");
	}
}