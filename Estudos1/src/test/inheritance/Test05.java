package test.inheritance;

public class Test05 {
	public static void main(String[] args) {
		Animal1 a = new Dog(); //Roda normalmente, imprime // Animal eats Dog eats Meat
		//Animal1 a = new Animal1(); //Retorna ClassCastException
		Dog d = (Dog) a;
		a.eat();
		d.eat("Meat ");
		print((short) 1532); //Para passar int para um método que recebe short e necessário fazer o (cast)
		short x = 1532; //Já para declaração de variáveis a conversão ocorre normalmente
		new Test05().m1();
		new Test05().m1("M1 Sobrecarregado...");
	}
	
	static void print(short i){
		System.out.println(i);
	}
	
	void m1(){
		System.out.println("M1");
	}
	
	private void m1(String txt){
		System.out.println(txt);
	}
}

 class Animal1{
	
	void eat(){
		System.out.println("Animal eats ");
	}
}

class Dog extends Animal1{
	void eat(String s){
		System.out.println("Dog eats " + s);
	}
}
