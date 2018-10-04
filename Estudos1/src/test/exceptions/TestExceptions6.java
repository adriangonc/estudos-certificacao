package test.exceptions;

public class TestExceptions6 {

	public static void main(String[] args) {
		try {
			dividir(7, 0);
		} catch (IllegalArgumentException ia) {
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

}
