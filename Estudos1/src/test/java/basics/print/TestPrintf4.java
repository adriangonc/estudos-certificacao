package test.java.basics.print;

public class TestPrintf4 {

	public static void main(String[] args) {
		System.out.printf(">%0,8.2f<",15.32);
		System.out.printf(">%-(8.2f<",15.32);
		System.out.format(">%0(8.2f<",12.45);
		System.out.format(">%1$08.2f<",12.45);
		System.out.printf(">%0,(8.2f<",12.45);
	}

}
