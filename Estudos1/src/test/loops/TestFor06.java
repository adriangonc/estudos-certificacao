package test.loops;

public class TestFor06 {

	public static void main(String[] args) {
		int [][]ar ={{1,3,5},{7,8}};
		
		out:for(int a[] : ar){
			for(int i : a){
				if(i==7) continue;
				System.out.println(i);
				if(i==3) break;
			}
		}
	}

}
