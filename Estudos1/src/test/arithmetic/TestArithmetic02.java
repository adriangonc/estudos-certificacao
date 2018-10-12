package test.arithmetic;
import static java.lang.System.*;

public class TestArithmetic02 {
	static int z; //pode-se declarar variável estática sem inicializa-la.
	int j;
	static int x = 1532;
	public static void main(String[] args) {
		int x = 5, y = 20;
		
		out.println(y /= x); //Recebe a divisão de y por x
	}
	
	static {int z = 2;//Sonbreia a variável z da classe
		out.println("Variável z sombreada: " + z);
		out.println("Variável z da classe: " + TestArithmetic02.z);
	}
}
