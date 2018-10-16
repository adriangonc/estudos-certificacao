package test.string.date;

public class TestString10 {

	public static void main(String[] args) {
		char[] c = {'A','G','S'};
		String a = String.copyValueOf(c,0,2);
		System.out.println(a);
		System.out.println(c);
		
		
		char[] ca = {'A','G','S'};
		String t = "1234567";
		t.getChars(0, 2, ca, 1);
		System.out.println(ca); //A12
		
		String[] st = {"G","O","N","C"};
		String join = String.join("*", st);
		System.out.println(join); //G*O*N*C
		
		StringBuilder sb = new StringBuilder("ABC");
		//sb.concat(); //Concat existe somente na classe string.
		sb.append("123"); //Para concatenar string builder usamos 'append'.
	}

}
