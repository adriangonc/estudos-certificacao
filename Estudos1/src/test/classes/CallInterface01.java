package test.classes;

public class CallInterface01 {

	public static void main(String[] args) {
		TestInterface01 i = new TestInterface01() {
		}; // Esse código cria uma classe anónima que implementa a interface.
		System.out.println(i.verdade());
	}

}
