package test.polymorphism;

public class Bf2 extends B{

	Bf2(){
		super();
		z(x()); //caso como ha um método com o mesmo nome na classe pai e na classe filha o método chamado da classe pai acionou o segundo método que existia na classe filha.
	}
	void z(int i) {
		System.out.println(i);
	}
	int y() {return 1532;}
}
