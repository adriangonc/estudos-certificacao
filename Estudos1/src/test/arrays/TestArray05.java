package test.arrays;

public class TestArray05 {

	public final static void main(String args[]) {
		int array[][] = {{1,2,3},{4,5}};
		
		for(int[] a : array)
			for(int i : a) System.out.println(i + "  ");
	}

}
