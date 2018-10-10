package test.polymorphism;

class A{
	A method(){
		return new A();
	}
}

class B1 extends A{
	B1 method(){
		return new B1();
	}
}

public class Test01 {

	public static void main(String[] args) {
		//Códigos
	}

}
