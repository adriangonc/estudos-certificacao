package test.lambda;

import java.util.function.Predicate;

public class TestLambda04 {
	int id;
	public static void main (String...args){
		TestLambda04 tl = new TestLambda04();
		tl.id = 1532;
		check(tl, p -> p.id > 100); //Expressão lambda
	}
	
	protected static void check(TestLambda04 tl, Predicate<TestLambda04> pre){ //Predicate interface para testar igualdade
		String result = pre.test(tl)?"yes":"not";
		System.out.println(result);
	}
}
