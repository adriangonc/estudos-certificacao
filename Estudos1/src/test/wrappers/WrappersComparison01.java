package test.wrappers;

public class WrappersComparison01 {

	public static void main(String[] args) {
		Integer i1 = 1532;
		Integer i2 = 1532;
		
		System.out.println(i1 == i2); //false pois não mantem números acima de 127 ou menores que -128 em cache.
		System.out.println(i1.equals(i2));
		
		Integer i3 = 127;
		Integer i4 = 127;
		System.out.println(i3 == i4); //Aqui a comparação funciona pois Short e Ingeger entre -128 e 127 são mantidos em chache pelo java.
		
		Boolean b1 = Boolean.valueOf("True");
		Boolean b2 = true;
		
		System.out.println(b1 == b2);
		
		Character c1 = 'A';
		Character c2 = Character.valueOf('A');
		System.out.println(c1 == c2);
	}

}
