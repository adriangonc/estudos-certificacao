package test.string.date;

import java.time.Period;

public class DateAndPeriod {

	public static void main(String[] args) {
		Period p = Period.parse("p01y");
		System.out.println(p); //Output: P1Y
	}

}
