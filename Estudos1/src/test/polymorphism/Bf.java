package test.polymorphism;

public class Bf {

	public static void main(String[] args) {
		String s = null;
		B b = new B(s); //Compila e não imprime nada
		//B b = new B(txt); //Não compila pois não podemos passar um método de referencia a um construtor this.
	}
	static String txt() {
		return "Adr";
	}
}
