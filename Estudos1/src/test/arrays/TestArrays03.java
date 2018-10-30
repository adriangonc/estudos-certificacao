package test.arrays;

import java.util.Arrays;

public class TestArrays03 {
	int array[][] = new int [1][];
	public static final void main(String[] args) { //Métodos maim podem ser final
		
		int array[][] = new int [0][]; //E obrigatória a inicialização da primeira dimenssão do array.
		int array2[][][] = {{{2},{1},{0}}}; //E necessário haver um '{' para cada dimensão do array
		int array3[][][] = {{{2,22,222},{1,11,111}}}; //Dois arrays bidimensionais.
		
		System.out.println(array2[0][2][0]);
		System.out.println(array3[0][1][2]);
		
		long [][] l2d;
		long[] l1d = {1,2,3};
		Object o = l1d;
		l2d = new long[3][3];
		//l2d[0][0] = (long[]) o; //Não funciona pois não e possível passar um objeto de 1 dimensão do array para um elemento long do array.
		//l2d[0] = (long[]) o;
		//l2d[0][0] = (long) o;
	}

}
