package test.arithmetic;

public class TestArthmetic07 {

	public static void main(String[] args) {
		short s = 1522;
		s += 10; //V�lido pois retorna short
		s++; //V�lido pois incrementa short
		//s = s + 1; //Inv�lido pois retorna int como resultado da soma
		System.out.println(s);
		Character c = new Character('c'); //O construtor recebe somente char.
		c = "test".charAt(0); //Um dos n�nicos jeitos de converter string para char.
	}

}
