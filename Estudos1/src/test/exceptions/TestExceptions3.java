package test.exceptions;

public class TestExceptions3 {

	public static void main(String[] args) throws java.io.IOException{
		System.out.println("a");
		new TestExceptions3().m(); 
		System.out.println("b");
	}

	void m() throws java.io.FileNotFoundException {
		System.out.println("c");
		try {
			m2();
		} catch(java.io.FileNotFoundException e) {
			
		}
		System.out.println("d");
	}

	void m2() throws java.io.FileNotFoundException {
		System.out.println("e");
		new ExceptionClass3(); //Programa roda normalmente sem exception
		//throw new ExceptionClass3(); //Erro de compilação por Unreachable code
		System.out.println("f");
	}

}
