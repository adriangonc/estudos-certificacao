package estruturas.de.desisao;

public class TestCase05 {

	public static void main(String[] args) {
		
		//var = 10; //Se o case correspondente estiver após o default ele não roda.
		double d = 1_5.3_2; //Válido
		int var = 1_5_3_2; //Se não houver nenhum case correspondente o default e rodado.
		switch(var){
		case 1: case 2: case 3: case 4: System.out.println(4); case 5:
			case 7: System.out.println(7); break; //Caso um case anterior seja verdadeiro 
												  //todos os outros cases vão rodar 
												  //até que termine o switch ou tenha um break.
			case 8 : {System.out.println(8); }
			default: System.out.println("Default...");
			case 10:
			case 15: System.out.println(15); //Resultado: Default... 15
		}
	}

}
