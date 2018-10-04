package test.polymorphism;

public class Const1 {
	String name = "Adriano";
	Const1() {
		//this.Const1(name); //Compila
	}
	
	void Const1(String s) { //ATENÇÃO! se houver um tipo como void não e mais um construtor e sim um método
		//this(); //Logo Não podemos chamar this de dentre de um método.
	}
	
	Const1(String s){
		this(); //Agora funciona o this :)
	}
	
}
