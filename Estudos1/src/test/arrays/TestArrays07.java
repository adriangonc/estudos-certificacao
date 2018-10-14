package test.arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class TestArrays07 {

	public static void main(String[] args) { 
		ArrayList<String> s = new ArrayList<>(); //Capacidade padrão do array e 10
		ArrayList<String> s1 = new ArrayList<>(1532); //Não influencia no size() que continua 0
		ArrayList<String> s2 = new ArrayList<String>();
		s.add("a");
		s.add("b");
		
		System.out.println(s.size() ); //0
		System.out.println(s1.size() ); //0
		
		int array[] = new int[10];
		
		Arrays.fill(array, 9); //Preenche todo o array com 9
		System.out.println(array[5]);
	}

}
