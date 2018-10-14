package test.arrays;

public class TestInitializingArrays08 {

	public static void main(String[] args) {
		int[] a1 = {1,5,3,2};
		int a2[] = {1,5};
		
		System.out.println(new int[] {1,5,3,2}); //Cria um array anônimo

		for(int[] i : new int[][] {{1,5,3,2}, {1,2,3}}){
			for(int j = 0; j<i.length;j++){
				System.out.println(i[j]);
			}
		}
		
		Object o = a1; //Converte array para Object
		int at[] = (int[]) o; //Faz cast de Object para array
		for(int i : at){
			System.out.println(i); //Imprime posições do array
		};
	}

}
