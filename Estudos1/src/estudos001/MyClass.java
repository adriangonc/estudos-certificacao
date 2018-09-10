package estudos001;

public class MyClass {

	public MyClass myMethod() {
		MyClass object1 = new MyClass();
		MyClass object2 = new MyClass();
		return object1;
	}

	public static void main(String[] args) {
		MyClass object3 = new MyClass().myMethod();
		System.out.println("Classe executada com sucesso...");
	}

}
