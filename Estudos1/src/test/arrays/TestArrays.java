package test.arrays;

class TestArrays {

	public static void main(String[] args) {

		int[] testArray = {1,2,3,4,5}; //ok
		int testArrayDois[] = {3,2,1}; //ok mas não aconselhavel
		int[][][] multiDimensionalArray = new int[2][][]; //S� e exigido que a primeira dimens�o do array esteja preenchida
		
		System.out.println(testArray[4]);
		System.out.println(testArray[1532]); //Compila mas causa erro de execução!
	}

}
