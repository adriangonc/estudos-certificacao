package test.loops;

public class TestLoops05 {

	public static void main(String[] args) {
		new TestLoops05().iterator(new int[] { 1, 2, 3 });
	}

	void iterator(int[] i) {
		
		//private int b = 0; não e permitido usar private, protected ou public em escopo local :o
		int b = 0;

		for (int a = 0; a < 5; System.out.println(a))
			a++;// Começa de 1, A ordem de execução do for é: verifica condição
				// > executa o conteudo do for {} > depois incrementa a variável

		for (int a = 0; a < 5; a++) {
			System.out.println(a); // Começa a imprimir de 0, pois o bloco e
									// executado antes do primeiro incremento da
									// variável a
		}

		/*for (int x = 0; x < i.length; System.out.print(i[x] + " ")) {
			x++;
		}*/
		
		int z = 10;
		int _ = 1;    int _um = 1;
		int $ = 1532; int $dois = 2;
		System.out.println(z + _ + $ + _um + $dois);
		
		if((z = 0) < 2){System.out.println("Entrou no if...");}
		while((z = 1) == 1){
			System.out.println("Entrou no while..."); //
			break;
		}
		
		if(false ^ true){System.out.println("Entrou em ^");} //Só executa se o segundo booleano for diferente do primeiro.
		
	}

}
