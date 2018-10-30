package test.lambda;

public class TestCalculator01 {

	public static void main(String[] args) {
		Integer c = 15;
		Integer d = 20;
		Calculator01<Integer> sum = (a , b) -> a + b;
		
		Calculator01<Integer>	subtract	=	(a,b)	->	{return	a	-	b;};
		
		for(int	i	=	0;	i	<	10;	i++){
			new	Thread(()	->	System.out.println(c)).start();
											}		
		System.out.println();
	}
	
	static void calc(Integer i, Integer j){
		Calculator01<Integer> sum = (a , b) -> a + b;
	}

}
