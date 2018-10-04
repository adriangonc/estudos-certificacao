package test.polymorphism.abstractclass;

public class CallB1 {

	public static void main(String[] args) {
		SubClassB1 b1 = (SubClassB1) (SubClassA1) new SubClassB1();
		b1.x();
	}

}
