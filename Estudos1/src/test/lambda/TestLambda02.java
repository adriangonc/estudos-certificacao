package test.lambda;

import java.util.function.Predicate;

public class TestLambda02 {

	public static void main(String[] args) {
		new TestLambda02().method(1532, a -> a > 1531);
	}
	void method(int a, Predicate<Integer> d){
		if(d.test(a)){
			System.out.println(a);
		}
	}
}
