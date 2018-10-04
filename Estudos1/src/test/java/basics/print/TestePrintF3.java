package test.java.basics.print;

public class TestePrintF3 {

	public static void main(String[] args) {
		System.out.printf("%s \n", 1532);
		System.out.printf("%d\n", new Integer(1532));
		System.out.printf("%d", (short)(byte)(double) (1532) );
	}

}
