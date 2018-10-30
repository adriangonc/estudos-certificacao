package test.arrays;

import java.util.Arrays;

public class TestArray09 {

	public static void main(String[] args) {
		int[] a = { 1, 2, 3 }, b = { 1, 2, 3 };
		
		Integer[] a1 = {1,2,3,4};
		Integer[] a2 = {1,2,3,4};
		
		System.out.println(a==b);
		System.out.println(Arrays.equals(a, b));
		//System.out.println(Arrays.deepEquals(a, b)); //O método 'Arrays.deepEquals(a,a1)' aceita somente arrays de Object
		System.out.println(Arrays.deepEquals(a1, a2)); //Como o array e de Integer compara e retorna true.
	}

}
