package test.classes;

public class TestClass11 {

	{i = 1532;}; final int i;
	final int x = 2;
	final int y; TestClass11(){y = 1532;}
	
	public static void main(String[] args) {
		
		TestClass11 tc = new TestClass11();
		System.out.println(tc.i);
		int y = 1;
		final int c = 2;
		
		
		switch(y){
		case 1 :{System.out.println("A");}
		case c :{System.out.println("B");}
		}
	}
	
	void met(){
		final int z;
		z = 1532;
		System.out.println(z);
	}

}
