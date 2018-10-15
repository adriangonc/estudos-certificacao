package test.string.date;

import java.util.ArrayList;

public class TestString08 {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("Fallen O lol");
		sb.insert(sb.lastIndexOf("lol"), true);
		System.out.println(sb);
		short i = (short) sb.length();
		String a = "AGS";
		byte b = (byte) a.length();
		
		System.out.println(b + i);
		
		ArrayList<String> list = new ArrayList<>(1532);
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		list.spliterator();
		System.out.println(list);
	}

}
