package test.variable.scope.one;

//answer the question: C: number 0 is printed on the console? / Wrong, a compile-time error is produced, the block can access the number variable, so 
// is wrong declare number again.

public class Question3 {
	public static void main(String... args) {
		int number = 0;
		{
			//int number = 1;
		}
		System.out.println(number);
	}
}
