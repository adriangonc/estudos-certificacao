package test.arrays;

public class TestArrays04 {

	public final static void main(String[] args) {
		int[]a = {3,2,1,0};
		int y = a.length;
		int x = y -1;
		
		while(y >= 0){
			System.out.println(a[--y]);
		}
	}

}
