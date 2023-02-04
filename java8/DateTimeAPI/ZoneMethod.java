package DateTimeAPI;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZoneMethod {
	public static void main(String[] args) {
		ZonedDateTime date = ZonedDateTime.parse("2020-08-28T19:10:38.492+05:30[Asia/Kolkata]");
	      ZonedDateTime result = date.withZoneSameInstant(ZoneId.of("Asia/Tokyo"));
	      System.out.println(result); 
	}
}
