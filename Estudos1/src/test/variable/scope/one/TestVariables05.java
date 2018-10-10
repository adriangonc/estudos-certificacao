package test.variable.scope.one;

public class TestVariables05 {
	
	static int a,b = 16,c;
	int i = j;
	static int j = 1532;
	static int i2 = 1600;
	static int j2 = i2;

	public static void main(String[] args) {
		int x, y = 1532, z;
		System.out.println(b);
		//System.out.println(x); Erro de compilação pois x e local e não foi inicializada.
		System.out.println(y); //Funciona pois y foi inicializada.
	}

}
