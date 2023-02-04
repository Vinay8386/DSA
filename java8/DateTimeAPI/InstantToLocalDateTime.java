package DateTimeAPI;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;

//Convert instant to localDateTime
public class InstantToLocalDateTime {
	public static void main(String[] args) {
		Instant instant = Instant.now();
        System.out.println("Instant : " + instant);
        LocalDateTime ldt = LocalDateTime.ofInstant(instant, ZoneOffset.UTC);
        System.out.println("LocalDateTime : " + ldt);
	}
}
