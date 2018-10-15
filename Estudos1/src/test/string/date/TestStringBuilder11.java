package test.string.date;

public class TestStringBuilder11 {

	public static void main(String[] args) {
		char a[] = {'A','g','s'};
		String n = new String(a);
		String n2 = "12345";
		n2 = n2.substring(2);
		n += n2;
		System.out.println(n);
		StringBuilder sb = new StringBuilder("Abcd");
		sb.append(sb.substring(2));
		System.out.println(sb); //Abcdcd
	}

}
