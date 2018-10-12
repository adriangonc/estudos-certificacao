package test.classes;

public class TestClassVarInitialization04 {

	{i = 1532;}
	final int i; // E obrigat�ria a inicializa��o de vari�veis final

	TestClassVarInitialization04() {
		// i = 1532; //Tamb�m pode ser inicializada aqui.
	}

	public static void main(String[] args) {
		TestClassVarInitialization04 varInit = new TestClassVarInitialization04();
		System.out.println(varInit.i); //Imprime 1532
	}
}
