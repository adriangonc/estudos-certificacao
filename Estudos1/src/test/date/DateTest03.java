package test.date;

import java.time.Duration;
import java.time.LocalDateTime;

public class DateTest03 {

	public static void main(String[] args) {
		LocalDateTime d1 = LocalDateTime.now();
		LocalDateTime d2 = LocalDateTime.now().plusDays(5);
		System.out.println(Duration.between(d1,	d2));
		System.out.println(Duration.between(d1,	d2).toHours());
	}

}
