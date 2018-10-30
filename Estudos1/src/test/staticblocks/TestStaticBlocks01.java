package test.staticblocks;

public class TestStaticBlocks01 {

	public static void main(String[] args) {
		System.out.println("A");
	}

	{System.out.println("Bloco não estático, nem executa!!!");}
	
	static {System.out.println("Executa antes no main");}
}
