package test.string.date;

public class TestString07 {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("AGS");
		StringBuilder sb2 = new StringBuilder("AGS");
		String a = new String("AGS");
		System.out.println(a.equals(sb)); 	// false
		System.out.println(sb.equals(sb2));	// false
		System.out.println(sb == sb2);		// false
		System.out.println(a.toString().equals(sb.toString())); // true
		System.out.println();
		//System.out.println(a==sb); erro pois não podemos compara String e StringBuilder diretamente
	}

}
