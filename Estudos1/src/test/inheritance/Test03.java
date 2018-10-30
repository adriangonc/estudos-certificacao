package test.inheritance;

import test.loops.Loops;

public class Test03 {

	public static void main(String[] args) {
		Atest at = new Btest();
		at.method(); //Chama o m�todo de A pois este e est�tico que n�o e herdado pelas sub classes, estes s�o somente acess�veis para as classes filhas.
		Atest.method();
		
		Btest b = new Btest();
		b.method(); //Chama o m�todo de B
	}

}

class Atest extends Loops{
	static void method(){
		Character c = new Character('a'); //S� aceita char
		System.out.println("A");
	}
}

class Btest extends Atest{
	static void method(){ //E obrigat�rio que m�todos tenham um tipo, mesmo que seja void
		System.out.println("B");
	}
}