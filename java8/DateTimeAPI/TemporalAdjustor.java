package DateTimeAPI;

import java.time.DayOfWeek;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.temporal.TemporalAdjusters;
import java.util.Date;

public class TemporalAdjustor {
	public static void main(String[] args) {
		
		Date date=new Date();
		Instant instant=date.toInstant();
		LocalDate localDate=instant.atZone(ZoneId.systemDefault()).toLocalDate();
		
		LocalDate with1 = localDate.with(TemporalAdjusters.lastDayOfMonth());
        System.out.println("lastDayOfMonth : " + with1);


        LocalDate with2 = localDate.with(TemporalAdjusters.next(DayOfWeek.SATURDAY));
        System.out.println("next monday : " + with2);
	}
}
