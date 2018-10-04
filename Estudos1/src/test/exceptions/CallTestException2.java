package test.exceptions;

public class CallTestException2 {

	public static void main(String[] args) throws java.io.FileNotFoundException {
		System.out.println("a");
		new TestExceptions2().m();
		System.out.println("b");
	}

}
