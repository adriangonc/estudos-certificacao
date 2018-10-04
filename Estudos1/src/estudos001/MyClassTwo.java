package estudos001;

public class MyClassTwo {

	public static void main(String[] args) {
		booleanExample();
		integralExample();
		floatingPointExample();
		characterExample();
		compareInteger();
		verifyChar();
	}

	public static void booleanExample() {
		Boolean bool = Boolean.logicalAnd(false, true);
		int compare = bool.compareTo(false);
		System.out.println(compare);
	}

	public static void integralExample() {
		int sum = Integer.sum(1, 78);
		System.out.println(sum);
	}

	public static void floatingPointExample() {
		double max = Double.max(1.1, 2.2);
		System.out.println(max);
	}

	public static void characterExample() {
		int codePoint = Character.codePointAt("ADRIANO", 6);
		System.out.println(codePoint);
	}

	public static void compareInteger() {
		int compare = Integer.compare(0, 1);
		System.out.println(compare);
	}

	public static void verifyChar() {
		boolean defined = Character.isDefined('#');
		System.out.println(defined);
	}
}
