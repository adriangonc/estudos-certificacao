package test.inheritance;

public class Test {
	
	static Animal a = new Bird();
	
	public static void main(String...strings ) {
		System.out.println(new SubClass1().myObject);
		System.out.println(a instanceof Interface1); //Imprime true
		System.out.print(a instanceof Object); //Imprime true
	}
}
