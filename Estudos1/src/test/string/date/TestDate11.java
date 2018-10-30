package test.string.date;

import java.time.LocalDate;
public class TestDate11 {

	public static void main(String[] args) {
		LocalDate ld = LocalDate.of(1988,4,15);
		int days = ld.lengthOfMonth();
		System.out.println(days);
	}

}
