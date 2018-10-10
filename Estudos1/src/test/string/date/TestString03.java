package test.string.date;

public class TestString03 {

	public static void main(String[] args) {
		char c[] = new char[] {65,'b','c'};
		String cd = "abcde".substring(3); //Retorna todos os valores após o index passado
		String cs = new String(c);
		cs += cd;
		System.out.println(cs);
	}

}
