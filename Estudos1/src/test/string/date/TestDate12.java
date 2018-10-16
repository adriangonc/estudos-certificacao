package test.string.date;

import java.time.LocalDate;

public class TestDate12 {

	public static void main(String[] args) {
		LocalDate ld = LocalDate.of(2018,1,31).plusMonths(1); //2018-02-28 - vai para o ultimo dia válido do mês seguinte
		System.out.println(ld);
		ld = ld.of(1988,4,15).now(); //retorna somente a data atual.
		System.out.println(ld); //2018-10-15
		System.out.println(ld.getMonth() + " " + ld.getMonthValue() ); //OCTOBER
		
	}

}
