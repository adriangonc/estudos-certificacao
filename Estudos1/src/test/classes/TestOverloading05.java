package test.classes;


public class TestOverloading05 {
	static int x = 1532;

	public static void main(String[] args) {
		calc(1,1531); //Chama método int
		new TestOverloading05().calc(1.0, 1531); //Chama método double se houver algum double na chamada
	}

	public static void calc(int i, int j){
		System.out.println(i + j + " int");
		int t = x;
	}
	
	protected void calc(double i, double j){
		System.out.println(i + j + " double");
	}
	
}
