package test.wrappers;

public class TestWrappers04 {

	public static void main(String[] args) {
		Double d = 10.0;
		Integer i = 10;
		double dd = 10;
		int ii = 10;
		Integer _i = 15;
		Integer _ii = 15;
		
		
		System.out.println(i.equals(d)); //False
		System.out.println(ii == dd); //True
		System.out.println(i == ii); //True
		System.out.println(_i == _ii); //Retorna true até 127 por causa do cache
	}

}
