package test.loops;

public class Loops {
	public static void main(String... args) {
		testFor();
		testEnhancedFor();
		testWhile();
		testDoWhile();
		testEnhancedForComFinal();
		testBrak();
		testContinue();
		testContinueLabel();
		exercicio01();
	}

	public static void testFor() {
		int[] intArray = { 1, 2, 3, 4, 5, 6, 7 };
		for (int i = 0; i < intArray.length; i = i + 1)
			System.out.print(intArray[i]);
	}

	public static void testEnhancedFor() {
		int[] intArray = new int[] { 1, 2, 3, 4, 5, 6, 7 };
		for (int arrayElement : intArray) {
			System.out.println(arrayElement);
		}
	}

	public static void testWhile() {
		int[] intArray = { 1, 2, 3, 4, 5, 6, 7 };
		int i = 0;
		while (i < 7) {
			System.out.print(intArray[i]);
			i++;
		}
	}

	public static void testDoWhile() {
		int[] intArray = { 1, 2, 3, 4, 5, 6, 7 };
		int i = 0;
		do {
			System.out.println(intArray[i]);
			i = ++i;
		} while (i <= 6);

	}

	public static void testEnhancedForComFinal() {
		int[] intArray = { 1, 2, 3, 4, 5 };
		for (final int num : intArray) {
			System.out.println(num);
		}
	}

	public static void testBrak() {
		int i, j;
		labelAdrianoFor: for (i = 1; i < 4; i++) {
			j = 1;
			while (j < 4) {
				j++;
				if (j % 2 == 0) {
					break labelAdrianoFor;
				}
				System.out.println("dentro");

			}
			System.out.println("fora");
		}

	}

	public static void testContinue() {
		int i, j;
		labelAdrianoFor: for (i = 1; i < 4; i++) {
			j = 1;
			while (j < 4) {
				j++;
				if (j % 2 == 0) {
					continue;
				}
				System.out.println("dentro");

			}
			System.out.println("fora");
		}

	}

	public static void testContinueLabel() {
		int i, j;
		labelAdrianoFor: for (i = 1; i < 4; i++) {
			j = 1;
			while (j < 4) {
				j++;
				if (j % 2 == 0) {
					continue labelAdrianoFor;
				}
				System.out.println("dentro");

			}
			System.out.println("fora");
		}

	}

	public static void exercicio01() {
		int i = 0, j = 0;
		while (i < 2) {
			while (j < 2) {
				if (i + j == 2)
					break;
				j++;
			}
			i++;
		}
		System.out.println(i + " " + j);
	}

}
