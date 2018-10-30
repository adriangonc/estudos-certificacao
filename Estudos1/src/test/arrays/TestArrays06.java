package test.arrays;

import java.util.Arrays;

public class TestArrays06 {

	public static void main(String[] args) {
		System.out.println(new String[] {"one", "two", "three"}); //Array anonimo
		
		int [][]ints = new int[3][3];
		ints[0] = new int[4];
		//ints[2] = {1,2}; //Constantes de array podem ser usadas somente na inicialização
		int[] intArray = {8,-1,-9,5,3,5};
		Arrays.sort(intArray);
		System.out.println(Arrays.binarySearch(intArray, 3)); //Retorna a posição no elemento buscado usando busca binária.
	}

}
