package estruturas.de.desisao;

public class TestBoolean03 {
	String a;
	final String b = "B";

	public static void main(String[] args) {
		boolean b1 = "Adriano".equals(new String("Adriano"));
		final String b = "B";
		System.out.println(b1);
		System.out.println();
		//System.out.print(); //Não funciona pois não podemos chamar o método print sem parâmetros.
	}

}
