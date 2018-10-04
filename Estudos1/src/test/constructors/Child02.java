package test.constructors;

public class Child02 extends Parent01{
	int i = 4;
	void run(int i) {
		System.out.println(i);
		System.out.println(this.i);
		System.out.println(super.i); 
	}
}
