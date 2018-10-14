package test.exceptions;

public class TestExceptions6 {

	public static void main(String[] args) {
		try {
			dividir(7, 0);
		} catch (IllegalArgumentException | NullPointerException ia) {
			System.out.println("Parâmetro inválido");
			ia.printStackTrace();
		}
	}

	public static void dividir(int i, int j) {
		if (j == 0) {
			throw new IllegalArgumentException();
		}
		System.out.println("Resultado: " + (i / j));
	}

	public static void test() {
		try {
			int x = 0 + 9;
			System.out.println("OK");
		} catch (RuntimeException runtime) {
			System.out.println("Runtime.");
		} catch (Exception ex1) {
			System.out.println("Exception here.");
		} finally {
			System.out.println("Finally here.");
		}
		System.out.println("Terminated.");
	}

}
