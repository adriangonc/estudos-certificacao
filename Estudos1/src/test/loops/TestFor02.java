package test.loops;

public class TestFor02 {

	public static void main(String[] args) {
		for(int x = 10, y = 5; x>y;x--, y++);
		for(int x = 1532, y = 2; x-- > y;);
		for(Long x = 10L, y = 5L; x > y; System.out.println(x--));
		for(;;);
	}

}
