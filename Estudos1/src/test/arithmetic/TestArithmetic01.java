package test.arithmetic;

public class TestArithmetic01 {
	
	public static void main(String[] args) {
		Double d1 = 1532.0; //também pode ser 1532.0d ou D
		double dp = 1532.0; //também pode ser 1532.0d ou D
		double dp2 = 1532.0D;
		Double d2 = 1532.0d;
		Float f1 = 64.000000f;
		float f2 = 32f;
		float f3 = 16.000f;
		
		Double r = d1 / 0.0;
		System.out.println(r); //Infinity... sem ArithmeticException In... Inn... Infinity power ;D 
		System.out.println(f3 / 0); //Infinity... sem ArithmeticException In... Inn... Infinity power ;D
		System.out.println(r.isInfinite()); //true pois foi dividido por 0.
	}
	
	public static void main(String args){ //Método não chmado pela JVM.
		
	}

}
