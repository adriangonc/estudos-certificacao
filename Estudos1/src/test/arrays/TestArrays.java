package test.arrays;

class TestArrays {

	public static void main(String[] args) {

		int[] testArray = {1,2,3,4,5}; //ok
		int testArrayDois[] = {3,2,1}; //ok mas não aconselhavel
		
		System.out.println(testArray[4]);
		System.out.println(testArray[1532]); //Compila mas causa erro de execução!
	}

}
