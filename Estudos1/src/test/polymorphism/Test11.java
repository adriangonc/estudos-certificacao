package test.polymorphism;

public class Test11 {

	public static void main(String[] args) {
		ASup a = new ASup();
		//BSub b = (BSub)a; //Class cast exception pois BSub e subclass de ASup
		
		BSub b1 = new BSub();
		ASup a1 = new BSub();
		ASup a2 = (ASup) b1;
		a2.method();
	}

}

class ASup{
	void A(int i){
		
	}
	
	void method(){
		System.out.println("A");
	}
}

class BSub extends ASup{
	void method(){
		System.out.println("B");
	}
}