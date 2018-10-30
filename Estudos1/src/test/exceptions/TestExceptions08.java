package test.exceptions;

public class TestExceptions08 {

	public static void main(String[] args) {
		new TestExceptions08().go();
	}
	
	void go() throws SecurityException{ //N�o exige que os m�todos que chamam tratem pois SecurityException e uma runtime exception.
		System.out.println("A");
		
		
		try{
			run(0);
			System.out.println("B");
		}catch(Exception e){
			System.out.println("C");
		}finally{
			System.out.println("D");
		}
	}
	
	void run(int i){
		try{
			System.out.println("E");
			int x = 1532/i;
			System.out.println("F");
		}catch(NumberFormatException nex){ //N�o roda pois NumberFormatE n�o trata exe��o aritm�tica
			System.out.println("G");
		}finally{
			System.out.println("H");
		}
		throw new RuntimeException(); //Tratamento de RuntimeE e opcional.
	}
	 
	void test(){
		go();
	}

}
