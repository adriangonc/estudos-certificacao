package test.date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.ZoneId;

public class DeclaringDataEndTime01 {

	public static void main(String[] args) {
		LocalTime currentTime = LocalTime.now();
		LocalDate today = LocalDate.now(ZoneId.of("America/Sao_Paulo"));
		LocalDateTime dateAndTime = LocalDateTime.now();
		LocalTime noon = LocalTime.of(12, 0);
		LocalDateTime someDateTime = LocalDateTime.of(1988, Month.APRIL, 15, 11, 45);
		LocalDateTime someDateTimeSara = LocalDateTime.of(1986, Month.AUGUST, 20, 11, 45);
		LocalDate someDate = LocalDate.of(1988, Month.APRIL, 15);
		LocalDate someDateSara = LocalDate.of(1986, Month.AUGUST, 20);
		Period interval = Period.between(someDate, someDateSara);
				
		System.out.println(currentTime + "\n" + today + "\n" + dateAndTime + "\n" + noon + "\n" + someDateTime);

		LocalDateTime now = someDateTime;
		System.out.println();
		System.out.println(now.getDayOfMonth());
		System.out.println(now.getDayOfYear());
		System.out.println(now.getHour());
		System.out.println(now.getMinute());
		//System.out.println(now.getYear());
		//System.out.println(now.getDayOfWeek());
		//System.out.println(now.getMonthValue());
		//System.out.println(now.getMonth());
		
		System.out.println();
		System.out.println(interval.toString());
		
	}

}
