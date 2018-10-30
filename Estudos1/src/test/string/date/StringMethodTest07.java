package test.string.date;

public class StringMethodTest07 {

	public static void main(String[] args) {
		String a = "A"; 
		String b = "B";
		String c = "C";
		System.out.println(a.compareTo(b)); // -1
		System.out.println(a.compareTo(a)); // 0
		System.out.println(c.compareTo(b)); // 1
		
		StringBuilder sb = new StringBuilder("Adr");
		sb.append(new char[] {'i','a','n','o'});
		sb.append(new char[] {'G','o','n','c','a','l','v','e','s'}, 0,4);
		System.out.println(sb); //AdrianoGonc
	}

}
