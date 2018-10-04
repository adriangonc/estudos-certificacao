package test.polymorphism;

public class B {
	B(){
		
	}
	
	B(String s){
		//test
		this();
	}
	
	int x (){return y();}
	int y (){return 3;}
}
