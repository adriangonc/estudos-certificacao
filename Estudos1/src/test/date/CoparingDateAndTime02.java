package test.date;

import java.time.LocalDate;
import java.time.MonthDay;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

public class CoparingDateAndTime02 {

	public static void main(String[] args) {
		MonthDay d1 = MonthDay.of(1, 1);
		MonthDay d2 = MonthDay.of(1, 2);
		System.out.println(d1.isBefore(d2));

		LocalDate aprilFools = LocalDate.of(2015, 4, 1);
		LocalDate foolsDay = LocalDate.of(2015, 4, 1);
		// are equals
		System.out.println(aprilFools.isEqual(foolsDay)); // true
		// does this object support days?
		System.out.println(aprilFools.isSupported(ChronoField.DAY_OF_MONTH)); // true
		// does this object supports hours?
		System.out.println(aprilFools.isSupported(ChronoField.HOUR_OF_DAY)); // false
		// Can I make operations with days?
		System.out.println(aprilFools.isSupported(ChronoUnit.DAYS));
		// true
		// Can I make operations with hours?
		System.out.println(aprilFools.isSupported(ChronoUnit.HOURS));
		// false
	}

}
