package test.arrays;

public class TestArray08 {

	public static void main(String[] args) {
		long[][] ld2;
		ld2 = new long[3][3];
		long [] l1d = {1,5,3};
		Object o = l1d;
		//ld2[0][0] = (long[]) o; //Não é possível colocar um array de long em uma posição que aceita long.
		long [] arrayTest = (long[]) o; // Já a atribuição de um array inteiro funciona
		System.out.println(arrayTest[1]);
	}

}
