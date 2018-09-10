public class AnnotationsAndTips {
	static int cont = 0;

	public static void main(String args[]) {

		printJavaTips();

	}

	public static void print(String text) {
		System.out.println(text);
	}

	private static void printJavaTips() {
		cont = 0;
		print("Java Buzzwords: \n	Simple. Object oriented. Distribuited. Interpreted. Robust. Secure. Architecture neutral. Plataform independent (portable). High performance. Multithreaded. Dynamic.");
		print("O compilador 'javac' consome 'source code' e produz 'bytecode'.");
		print("Se o nome do arquivo compilado e executado não e o mesmo da 'public class' declarada isso resulta em erro de compilação.");
		print("Ao chamar um programa java da linha de comando deve ser chamado o nome da 'main class' sem nenhuma extenção.");
		print("O construtor default por padrão tem a mesma acessibilidade da classe onde está.");
		print("Um método e uma classe podem ter o mesmo nome.");
		print("Não e possível importar duas classes com o mesmo nome de pacotes diferentes em java, ira ocorrer erro de compilação no segundo import.");
		print("E possível declarar variáveis com o mesmo nome em scopos diferentes, como uma na classe outra no método, o código ira utilizar a que está no scopo mais próximo.");
		print("Tomar muito cuidado com 'for' sem {}");
		print("Tentar compilar uma classe sem método main ira causar um erro e não uma exeption.");
		print("E possível usar a palavra static 'import static x.y' para importar somente os membros estáticos de uma classe.");
		print("Cada vez que um objeto e iniciado com new() e criada uma nova instancia desse objeto.");
		print("Ao apontar um segundo objeto para uma objeto criado não e criado um novo objeto, ele se torna apena uma segunda variavel para o mesmo objeto, \n	EX: Obj1 o = new Obj1(); Obj1 o2 = o; porem ao setar null em o2, o1 não é alterado.");
		print("O comparador da Wrapper class Integer.compare(1, 2) retorna -1 se o primiro número for menor que o segundo, 0 se forem iguais e 1 se o primeiro for maior que o segundo.");
		print("E possível usar underscore em literais, mas há regras: Ele não pode ficar no início ou fim de um número. Adjacente ao ponto decimal em um float. \n	perto dos sufixos L ou f ou no lugar onde uma string e esperada.\n	ou seja _ somente entre dígitos numéricos.");
		print("static Ingeter variavel; precisa ser inicializado para funcionar.");
		print("Não e possível adicionar int em uma variável short ex: short s = 10 //ok s = s+5 //não funciona.");
		print("variáveis iniciadas dentro de if causam erro de compilação ao serem usadas fora do if, pois o compilador entende que elas podem não ser iniciadas.");
		print("O valor default para classes e referências e null.");
		print("Variáveis de interfaces são implicitamente final, portando não e possível modificalas.");
		print("Variáveis do tipo short podem ser comparadas com int ou atribuidas a variáveis int.");
		print("O tipo ou retorno booleano não podem ser usado com o switch case.");

		// Testes
		{
			double test = 0.5_9; // works
			Integer t1 = Integer.decode("1532");
			Integer t2 = new Integer("15");
			Integer t3 = Integer.valueOf("32");
			/* Boolean b1 = "true"; não funciona */ Boolean b1 = new Boolean("true"); // funciona retorna true
			Boolean b2 = new Boolean("T"); // funciona retorna false, só o texto "true" retorna true

			// Ternary operator
			int i1 = 0;
			String saida = i1 > 0 ? "Número positivo" : "Número zero ou negativo";
			System.out.println(saida);
			String caso = "c";
			
			switch (caso) {
			case "a": 
				System.out.println("Letra a");
				break;
			case "b":
				System.out.println("A letra é ");
				System.out.println("b");
			default : System.out.println("Não corresponde a A ou B!");
			}
		}
	}

}
