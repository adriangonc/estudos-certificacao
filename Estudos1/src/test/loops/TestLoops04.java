package test.loops;

public class TestLoops04 {

	public static void main(String[] args) {
		cont(new int[] { 1, 2, 3 });
	}

	static void cont(int[] i) {
		for (int x = 0; x < i.length; System.out.println(x + ""))
			x++;
		for (int x = 0; x < i.length; System.out.println(i[x] + "")) // imprime 2 3 e gera erro IndexOut
			x++; // Mesmo que na leituto o for incremente x depois do print na
					// prática o incremento ocorre sempre que o for roda,
					// alterando ja na primeira rodada o valor de x para 1
	}
}
