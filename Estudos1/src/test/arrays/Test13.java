package test.arrays;

public class Test13 {

	public static void main(String[] args) {
		int array[][] = new int[2][]; //Pelo menos a primeira dimens�o tem que ser inicializada
									  //Caso contrario n�o compila.
		//array[0][0] = 1; //Retorna 'java.lang.NullPointerException' 
						 //pois a segunda dimens�o do array n�o foi inicializada.
		int []a = {1,2,3};
		array[1] = a ; //Essa seria a forma correta de inicializar a segunda dimens�o do array.
		array[1][0] = 5;
		System.out.println(array[1][0]);
	}

}
