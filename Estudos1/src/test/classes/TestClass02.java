package test.classes;

public class TestClass02 {
	static{System.out.println("Executa primeiro ;D");}
	{System.out.println("Executa em terceiro lugar se for instanciado com new Class...");}
	static{System.out.println("Executa em segundo :|");}
	
	public static void main(String[] args) {
		TestClass02 tc2 = new TestClass02();
	}

}
