package test.constructors;

public class Child01 extends Parent01{
	public Child01() {
		System.out.println("Child 01");
	}
	
	public Child01(String name) {
		this();
		System.out.println("Child 01 constructor 2");
	}
}
