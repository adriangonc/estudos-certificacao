package test.arithmetic;

public class TestArithmetic06 {
	static{System.out.println("1");}
	
	{System.out.println("2");}

	public static void main(String[] args) {
		Double d = 10.0/0;
		System.out.println(d);
		System.out.println(d.isInfinite());
		
		
	}

}
