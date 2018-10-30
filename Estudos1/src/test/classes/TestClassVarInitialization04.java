package test.classes;

public class TestClassVarInitialization04 {

	{i = 1532;}
	final int i; // E obrigatória a inicialização de variáveis final

	TestClassVarInitialization04() {
		// i = 1532; //Também pode ser inicializada aqui.
	}

	public static void main(String[] args) {
		TestClassVarInitialization04 varInit = new TestClassVarInitialization04();
		System.out.println(varInit.i); //Imprime 1532
	}
}
