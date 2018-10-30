package test.classes;

public class TestClass12 {

	public static void main(String[] args) {
		for (int x = 0; args.length > x++;) {
			System.out.println(args[x] + " "); //Começa a iterar com x incrementado o que gera ArrayIndexOutOfBounds
		}
	}

}
