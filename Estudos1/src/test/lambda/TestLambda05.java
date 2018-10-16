package test.lambda;

public class TestLambda05 {

	public static void main(String[] args) {
		Runnable run = () -> System.out.println("Rodando...");
		run.run();
	}

}
