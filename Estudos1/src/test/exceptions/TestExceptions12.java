package test.exceptions;

public class TestExceptions12 {
	static Integer i;

	public static void main(String[] args) {
		try {
			System.out.println("Try " + i.toString());
		} catch (RuntimeException re) {
			throw re; //Lan�a a exception sem que ela possa passar para o pr�ximo catch
		} catch (Exception e) {
			System.out.println("Exception ");
		} finally {
			System.out.println("fin");
		}
		//static int asdf = 0; //N�o se pode declarar vari�veis est�ticas dentro de m�todos
		int x = 10,y = 5;
		System.out.println("Test" + (x -y)); //Sem par�nteses n�o compila pois + come�ou sendo usado como concatenador e n�o para soma.
	}
	
	void met(){
		int a = 0;
	}

}
