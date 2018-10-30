package test.classes;

public abstract class TestAnimal {

	void run(){
		System.out.println("Animal run...");
	}
	abstract void sound(); //Métodos abstratos não podem ter corpo.
}
