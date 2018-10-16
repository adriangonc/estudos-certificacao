package test.arithmetic;

public class TestArthmetic07 {

	public static void main(String[] args) {
		short s = 1522;
		s += 10; //Válido pois retorna short
		s++; //Válido pois incrementa short
		//s = s + 1; //Inválido pois retorna int como resultado da soma
		System.out.println(s);
		Character c = new Character('c'); //O construtor recebe somente char.
		c = "test".charAt(0); //Um dos núnicos jeitos de converter string para char.
	}

}
