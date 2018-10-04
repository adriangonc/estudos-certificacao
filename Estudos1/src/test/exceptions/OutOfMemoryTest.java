package test.exceptions;

import java.util.*;

public class OutOfMemoryTest {

	public static void main(String[] args) {
		ArrayList<String> strings = new ArrayList<String>();
		for (int i = 0; i < 10; i++)
			for (int j = 0; j < 10; i++)
				strings.add("Enchendo memória da JVM : " + i + " " + j);
	}

}
