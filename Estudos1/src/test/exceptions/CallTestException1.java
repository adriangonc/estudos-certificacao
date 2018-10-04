package test.exceptions;

public class CallTestException1 {

	public static void main(String[] args) throws java.io.FileNotFoundException {
		System.out.println("a");
		new TestExceptions1().m();
		System.out.println("b");
	}

}
