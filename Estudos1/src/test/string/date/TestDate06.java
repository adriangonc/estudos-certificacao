package test.string.date;

import java.time.Period;

public class TestDate06 {

	public static void main(String[] args) {
		Period p1 = Period.ofYears(1);
		Period p2 = Period.of(0,2,0);
		Period p3 = p1.plus(p2); // soma os dois períodos.
		p3 = p3.plusDays(7); 
		
		System.out.println(p3);
		System.out.println(p3.getDays()); // Pega somente os dias do mês se o mês for inteiro retorna 0
	}

}
