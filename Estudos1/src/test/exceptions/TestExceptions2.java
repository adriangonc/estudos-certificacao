package test.exceptions;

public class TestExceptions2 {
	void m2() throws java.io.FileNotFoundException {
		System.out.println("e");
		new java.io.FileInputStream("a.txt");
		System.out.println("f");
	}

	void m() throws java.io.FileNotFoundException {
		System.out.println("c");
		try {
			m2();
		} catch (java.io.FileNotFoundException ex) {
		}
		System.out.println("d");
	}
}
