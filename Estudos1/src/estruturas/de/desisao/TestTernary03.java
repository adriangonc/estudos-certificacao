package estruturas.de.desisao;

public class TestTernary03 {

	public static void main(String[] args) {
		int x = 1;
		
		System.out.println(x < 1?"<":x > 1?">":"=");
		
		//IF equivalente
		if(x>1)
			System.out.println(">");
		else if(x < 1)
			System.out.println("<");
		else System.out.println("=");
	}

}
