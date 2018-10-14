package test.classes;

public class TestSubSubClass04 extends TestSubClass04{

	public TestSubSubClass04(String s) {
		super();
		System.out.println("SubSubClass ");
	}
	
	public static void main(String[] args) {
		new TestSubSubClass04("A");
	}

}
