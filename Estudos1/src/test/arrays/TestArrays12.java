package test.arrays;

import java.util.ArrayList;

public class TestArrays12 { //static e inválido para classes top level

	public static void main(String[] args) {
		ArrayList<String> ls = new ArrayList<>();
		String [] a1 = new String[4];
		ls.add("A"); ls.add("B"); ls.add("C");
		a1 = ls.toArray(a1);
		System.out.println(a1[1]); //B
		
	}

}
