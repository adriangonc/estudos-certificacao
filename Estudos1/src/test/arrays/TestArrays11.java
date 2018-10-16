package test.arrays;

import java.util.Arrays;

public class TestArrays11 {

	public static void main(String[] args) {
		int []a = new int[4];
		a[0] = 1;
		a[1] = 2;
		a[2] = 3;
		a[3] = 4;
		
		int a2[] = Arrays.copyOf(a, 10);
		for(int x = 0; x<a2.length;){
			System.out.println(a2[x]);
			++x;
		}
		
		throw new RuntimeException();
	}

}
