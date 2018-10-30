package test.classes;

public class TestClass03 {
	int sameName = 15;
	public final static void main(String...a){
		new TestClass03().printNumber();
		int cache = new TestClass03().printNumber(); //Também funciona
		System.out.println("Cache: " + cache);
	}
	
	public int printNumber(){
		int sameName = 1532;
		System.out.println(sameName);
		System.out.println(this.sameName);
		return sameName; //Funciona até com retorno :o
	}
}
