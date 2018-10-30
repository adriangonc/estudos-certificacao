package test.polymorphism;

public class Test12 {
	
	static int a, b = 5, c = a * b;
	static{System.out.println(c);} //0

	public static void main(String[] args) {
		Ts t = new Ts2();
		t.print();
		Ts2.print();
		Double d = 5.0;
		Integer i = 5;
		Long l1 = 15l;
		Long l2 = 14l;
		System.out.println(Long.remainderUnsigned(l1, l2)); //1
		System.out.println(Long.divideUnsigned(l1, l2)); //1
		float f = 2f;
		Integer i2 = 15;
		//Integer e = i2 + f; //O resultado será float, por isso não compila
		
	}

}

class Ts{
	public static void print(){
		System.out.println("TS");
	}
}

class Ts2 extends Ts{
	public static void print(){
		System.out.println("TS2");
	}
}
