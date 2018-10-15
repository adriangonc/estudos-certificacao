package test.inheritance;

public class Test06 extends SubClass{

	public static void main(String[] args) {
		new Test06("AGS");
	}
	
	Test06(String a){
		super();
		System.out.println("SubSubClass..."+a);
	}

}

class Super{
	Super(){
		System.out.println("Super class. ");
	}
}

class SubClass extends Super{
	SubClass(){
		System.out.println("Construtor sub class.. ");
	}
	{System.out.println("Normal block ");}
	static{System.out.println("Static block ");}
}