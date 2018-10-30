package test.classes;

public class TestSubClass04 extends TestMainClass04{
	
	{System.out.println("| ");}
	static {System.out.println("S ");} //Executa primeiro
	
	public TestSubClass04(int i) {
		this();
		System.out.println("SubClass ");
	}
	
	public TestSubClass04() {
		super();
		System.out.println("SubClass ");
	}
}
