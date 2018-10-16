package test.exceptions;

public class TestExceptions12 {
	static Integer i;

	public static void main(String[] args) {
		try {
			System.out.println("Try " + i.toString());
		} catch (RuntimeException re) {
			throw re; //Lança a exception sem que ela possa passar para o próximo catch
		} catch (Exception e) {
			System.out.println("Exception ");
		} finally {
			System.out.println("fin");
		}
		//static int asdf = 0; //Não se pode declarar variáveis estáticas dentro de métodos
		int x = 10,y = 5;
		System.out.println("Test" + (x -y)); //Sem parênteses não compila pois + começou sendo usado como concatenador e não para soma.
	}
	
	void met(){
		int a = 0;
	}

}
