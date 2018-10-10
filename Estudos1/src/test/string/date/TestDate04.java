package test.string.date;

import java.time.LocalDate;

public class TestDate04 {

	public static void main(String[] args) {
		LocalDate ld = LocalDate.of(2018,10,10);
		int days = ld.lengthOfMonth();
		System.out.println(days);
	}

}
