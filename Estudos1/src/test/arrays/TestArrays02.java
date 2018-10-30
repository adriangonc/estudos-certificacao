package test.arrays;

public class TestArrays02 {

	public static void main(String[] args) {
		int[] ints = new int[0b101];
		int len = ints.length;
		
		for (int i : ints)
			System.out.println(i);
	}

}
