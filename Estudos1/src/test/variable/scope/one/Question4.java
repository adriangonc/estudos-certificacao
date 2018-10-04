package test.variable.scope.one;

//answer the question: D, number 2 is printed on the console? / Right

public class Question4 {
	static int number = 0;
	public static void main(String[] args) {
		number ++;
		{
			number++;
		}
		System.out.println(number);
	}
}
