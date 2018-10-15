package test.exceptions;
import java.lang.Math.*; //Sem static não importa PI
import static java.lang.Math.*; //Com static importa a constante PI
public class TestExceptions10 {

	public static void main(String[] args) {
		System.out.println(PI);
	}
	
	public static void main(String a){
		System.out.println("A");
	}

	public static void main(int i){
		System.out.println(i);
	}
	
}
