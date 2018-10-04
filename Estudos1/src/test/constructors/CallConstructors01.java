package test.constructors;

public class CallConstructors01 {

	public static void main(String[] args) {
		Child01 c1 = new Child01("Test");
		Child02 c2 = new Child02();
		c2.run(2);
	}

}
