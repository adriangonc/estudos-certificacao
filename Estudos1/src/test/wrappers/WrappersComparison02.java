package test.wrappers;

public class WrappersComparison02 {

	public static void main(String[] args) {
		int a = Short.parseShort("126"); // A
		//short s = Integer.parseInt("23").shortValue(); // B N�o funciona a convers�o de int para short.Value()
		short s2 = Integer.valueOf("23").shortValue();
		double h = Double.valueOf("27").floatValue(); // C
		System.out.println(a + s2);
	}

}
