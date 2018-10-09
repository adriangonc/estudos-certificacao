package test.switchcase;

public class TestSwitchCase01 {

	public static void main(String[] args) {
		final int y = 2;
		final int x;
		
		x = 2;
		
		switch(x){
		//case x :{System.out.println("A");} //Não funciona x não foi inicializada no momento da declaração.
		case 0 :{System.out.println("A");}
		case 1 : System.out.println("B");
		default : System.out.println("default"); break;
		case y : System.out.println("C");
		}
	}

}
