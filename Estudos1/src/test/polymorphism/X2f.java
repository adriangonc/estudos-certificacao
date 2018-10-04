package test.polymorphism;

public class X2f extends X2{
	static int x = 1532;
	public static void main(String...args) {
		//System.out.println(this.x); //Não e possível usar this ou super em contexto estático
		System.out.println(x);
	}

}
