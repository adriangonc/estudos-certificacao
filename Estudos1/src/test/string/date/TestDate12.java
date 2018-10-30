package test.string.date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;

public class TestDate12 {

	public static void main(String[] args) {
		LocalDate ld = LocalDate.of(2018,1,31).plusMonths(1); //2018-02-28 - vai para o ultimo dia válido do mês seguinte
		System.out.println(ld);
		ld = ld.of(1988,4,15).now(); //retorna somente a data atual.
		System.out.println(ld); //2018-10-15
		System.out.println(ld.getMonth() + " " + ld.getMonthValue() ); //OCTOBER
		
		LocalDateTime ldt = LocalDateTime.now();
		LocalDate ld2 = LocalDate.now();
		LocalTime lt = LocalTime.now();
		Period p = Period.ofDays(7); //Retorna período em dias
		ldt = ldt.plus(p); //Plus adiciona período de tempo a data
		System.out.println(ldt + " / " + ld2 + " / " + lt); //2018-10-16T11:07:26.129 / 2018-10-16 / 11:07:26.129
	}

}
