package test.exceptions;

public class TestExceptions5 {

	public static void main(String[] args) throws java.io.IOException {
		System.out.println("a");
		new TestExceptions5().m();
		System.out.println("b");
	}

	void m() throws java.io.FileNotFoundException {
		System.out.println("c");
		try {
			m2();
		} catch (java.io.FileNotFoundException e) {

		}
		System.out.println("d");
	}

	void m2() throws java.io.FileNotFoundException {
		System.out.println("e");
		boolean yes = true;
		if (yes)
			throw new ExceptionClass3();
		System.out.println("f");
	}
}
