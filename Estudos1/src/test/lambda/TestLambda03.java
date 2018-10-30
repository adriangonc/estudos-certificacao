package test.lambda;

import java.util.function.Predicate;

public class TestLambda03 {

	public static void main(String[] args) {
		new TestLambda03().method(1532);
	}
	
	void method(int i){
		
		Predicate<Integer> d = a -> a >= 0;
		if(d.test(i)){
			System.out.println(i);
		}
	}
}
