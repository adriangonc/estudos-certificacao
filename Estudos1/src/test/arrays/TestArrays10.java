package test.arrays;

import java.util.Arrays;

public class TestArrays10 {

	public static void main(String[] args) {
		int[] ta = {5,7,9,2,6,4,1,0};
		Arrays.sort(ta,0,6);
		for(int i : ta){
			System.out.println(i);
		}
	}

}
