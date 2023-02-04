package DateTimeAPI;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Date;

public class DateToInstant {
	public static void main(String[] args) {
		
		Date date = new Date();
		ZoneId defaultZoneId=ZoneId.systemDefault();
		
		 //1. Convert Date -> Instant
		Instant instant = date.toInstant();
		System.out.println("instant : " + instant);

		// 2. Instant + system default time zone + toLocalDate() = LocalDate
		LocalDate localDate = instant.atZone(defaultZoneId).toLocalDate();
		System.out.println("localDate : " + localDate);
		
		
		//3. Instant + system default time zone + toLocalDateTime() = LocalDateTime
        LocalDateTime localDateTime = instant.atZone(defaultZoneId).toLocalDateTime();
        System.out.println("localDateTime : " + localDateTime);


        //4. Instant + system default time zone = ZonedDateTime
        ZonedDateTime zonedDateTime = instant.atZone(defaultZoneId);
        System.out.println("zonedDateTime : " + zonedDateTime);
	}
}
