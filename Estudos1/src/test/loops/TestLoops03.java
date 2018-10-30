package test.loops;

public class TestLoops03 {

	public static void main(String[] args) {
		int[]a = {1,2,3};
		
		for(int j :a){
			if(j==2) continue;
				for(int x = 0; x < 3; System.out.println(x)){
					x++;
				}
		}
	}

}
