package test.date;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;

public class TestDate04 {

	public static void main(String[] args) {
		LocalDate ld = LocalDate.of(1988, 4,15);
		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/M/yyyy");
		DateTimeFormatter format2 = DateTimeFormatter.ofPattern("d MMMM uuuu");
		System.out.println(ld.format(format));
		System.out.println(ld.format(format2));
		
		LocalTime lt = LocalTime.of(1,30,59); 
		System.out.println(lt.getMinute());
		System.out.println(lt.getLong(ChronoField.valueOf("MINUTE_OF_DAY")));//Retorna 90min se for passada uma string errada para chronoFild retorna ilegal argumente exception.
	}

}
