package test.arithmetic;
import static java.lang.System.*;

public class TestArithmetic02 {
	static int z; //pode-se declarar vari�vel est�tica sem inicializa-la.
	int j;
	static int x = 1532;
	public static void main(String[] args) {
		int x = 5, y = 20;
		
		out.println(y /= x); //Recebe a divis�o de y por x
	}
	
	static {int z = 2;//Sonbreia a vari�vel z da classe
		out.println("Vari�vel z sombreada: " + z);
		out.println("Vari�vel z da classe: " + TestArithmetic02.z);
	}
}
