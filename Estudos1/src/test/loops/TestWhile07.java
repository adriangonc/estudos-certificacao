package test.loops;

public class TestWhile07 {

	public static void main(String[] args) {
		int x = 0;
		
		do{
			System.out.println(x);
		}while(x++<2);
		
		for(x = 0;x++<2;)
			System.out.println(x);
	}

}
