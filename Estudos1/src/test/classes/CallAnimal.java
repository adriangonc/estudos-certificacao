package test.classes;

public class CallAnimal {

	public static void main(String[] args) {
		TestAnimal cat = new TestCat(); //Não podemos instanciar diretamente uma classe abstrata por isso usamos cat que e uma classe mais especializada.
		TestCat tcat = new TestCat();
		cat.run();
		cat.sound();
		tcat.sound();
		
		TestMotherCat cat2 = new TestCatSon();
		try {
			cat2.catJump();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
