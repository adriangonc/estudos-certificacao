package test.arithmetic;

public class Test08 {

	public static void main(String[] args) {
		final int z =3;
		int x = 9, y = 3;
		int res = (x + y / y)/* 10 */ * y/* 3 */;
		System.out.println(res);// 30
		switch(res){
		case z: System.out.println(z); break;
		case 30: System.out.println(res); break;
		default : System.out.println("Default...");
		}
	}

}
