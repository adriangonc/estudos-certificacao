package test.arithmetic;

public class TestComparingInteger04 {

	public static void main(String[] args) {
		Integer a = 127, b = 127;
		Integer c = new Integer(127);
		Integer d = new Integer(127);
		Integer e = 128, f = 128;
		System.out.println((a==b) + " " + (c==d) + " " + (e==f)); //true false false //O cache de Integer vai de -128 at� 127 somente n�meros nesse range v�o retornar true quando comparados com ==
		System.out.println(c.equals(d)); //true
	}

}
