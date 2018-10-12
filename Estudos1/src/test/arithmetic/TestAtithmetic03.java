package test.arithmetic;

public class TestAtithmetic03 {

	public static void main(String[] args) {
		Integer i = 1532; //Não e possível usar == para comparar integer e double.
		Double d = 1532.0;
		int ii = 1532;
		double dd = 1532; //double primitivo aceita inteiros
		
		System.out.println(ii == dd); //int e double podem ser comparados com ==
		System.out.println(d.equals(i) +  " " + i.MAX_VALUE);
		
		Long l1 = 12l; //Long precisa de l ao fim do número ao contrário de long.
		Long l2 = 0x9fCl; //Essa gambiarra funciona :/
		System.out.println(l2);
		
		System.out.println(d == dd); //Comparar um Wrapper com primitivo usando ‘==’ e válido isso converte o wrapper em primitivo e faz a comparação.
		System.out.println(d.MAX_VALUE);
		
		byte sizeArray = 127;
		int[] array = new int[sizeArray];
	}

}
