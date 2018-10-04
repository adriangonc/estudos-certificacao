package test.exceptions;

public class TestExceptions1 {
	void m2() throws java.io.FileNotFoundException {
		System.out.println("e");
		new java.io.FileInputStream("a.txt");
		System.out.println("f");
	}

	void m() throws java.io.FileNotFoundException {
		System.out.println("c");
		m2();
		System.out.println("d");
	}

}
