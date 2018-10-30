package test.methods;

public class TestMethods {
	
	 static int a, b = 1, c =2, d =b+c;
	 static int z = d;
	 static Float f = 10f;

	public static void main(String[] args) {
		System.out.println(z);
		somar();
	}
	
	static void somar(){ //Funciona
		float f1 = 1532; //Compila sem o f
		Float f2 = 1532f;//Compila somente com f
		long l1 = 15;
		Long l2 = 16l;
		throw new RuntimeException();
	}
}
