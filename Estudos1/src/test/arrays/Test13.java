package test.arrays;

public class Test13 {

	public static void main(String[] args) {
		int array[][] = new int[2][]; //Pelo menos a primeira dimensão tem que ser inicializada
									  //Caso contrario não compila.
		//array[0][0] = 1; //Retorna 'java.lang.NullPointerException' 
						 //pois a segunda dimensão do array não foi inicializada.
		int []a = {1,2,3};
		array[1] = a ; //Essa seria a forma correta de inicializar a segunda dimensão do array.
		array[1][0] = 5;
		System.out.println(array[1][0]);
	}

}
