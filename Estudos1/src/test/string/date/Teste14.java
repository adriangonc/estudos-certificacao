package test.string.date;

import java.time.Period;

public class Teste14 {

	public static void main(String[] args) {
		Period p = Period.ofYears(1532);
		Period p2 = Period.ofMonths(2);
		Period p3 = p.plus(p2);
		p3 = p3.plusDays(15); //se n�o forem adicionados dias o m�todo getDays() ir� retornar 0
		System.out.println(p3.getDays());
	}

}
