package test.arrays;

import java.util.Arrays;

public class TestArrays03 {
	int array[][] = new int [1][];
	public static final void main(String[] args) { //M�todos maim podem ser final
		
		int array[][] = new int [0][]; //E obrigat�ria a inicializa��o da primeira dimenss�o do array.
		int array2[][][] = {{{2},{1},{0}}}; //E necess�rio haver um '{' para cada dimens�o do array
		int array3[][][] = {{{2,22,222},{1,11,111}}}; //Dois arrays bidimensionais.
		
		System.out.println(array2[0][2][0]);
		System.out.println(array3[0][1][2]);
		
		long [][] l2d;
		long[] l1d = {1,2,3};
		Object o = l1d;
		l2d = new long[3][3];
		//l2d[0][0] = (long[]) o; //N�o funciona pois n�o e poss�vel passar um objeto de 1 dimens�o do array para um elemento long do array.
		//l2d[0] = (long[]) o;
		//l2d[0][0] = (long) o;
	}

}
