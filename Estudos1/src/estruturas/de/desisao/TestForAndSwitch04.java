package estruturas.de.desisao;

public class TestForAndSwitch04 {
static int z;
	public static void main(String[] args) {
		int variavelNaoFinal;
		variavelNaoFinal =1;
		
		final int variavelFinal = 3; //Não se pode usar a mesma variável ou valor em mais de um case. 
		for(int i =0; i<3;i++ ){
			switch(i) { //Variável não final
				case 0:break;
				case 1:System.out.print(1); //Somente variáveis final ou valores
				case 2:System.out.print(2);
				default:System.out.print("Default ");
				case variavelFinal:System.out.print("3 "); //12Default 3 2Default 3  
			}
		}
		
		float f = 10.3f; //Os primitivos float e double podem ser comparados, 
						//já os wrappers Fload e Double não não podem ser comparados com ==
		double d = 3.0;
		long l = 3;
		System.out.println("\n" + (d==f) + " " + (d==l)); //false true
		
	}

}
