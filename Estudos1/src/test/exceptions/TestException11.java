package test.exceptions;

public class TestException11 {

	public static void main(String[] args) throws Exception{
		try {
			System.out.println("Try ");
			System.out.format("%d",1532);
			System.out.format("%08d",1532);
			throw new Exception("Exe��o lan�ada...");
		} catch (Exception a) {
			throw a;
		} finally {
			System.out.println("Finally...");
		}

	}

}
