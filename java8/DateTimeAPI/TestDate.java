package DateTimeAPI;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

//Convert string to local date time..
public class TestDate {
	public static void main(String[] args) {
		
		String now = "2017-06-13 12:30";
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
		LocalDateTime formatDateTime = LocalDateTime.parse(now, formatter);
		
		System.out.println("Before : " + now);
		System.out.println("After : " + formatDateTime);
		System.out.println("After : " + formatDateTime.format(formatter));
		
		formatter=DateTimeFormatter.ofPattern("EEEE",Locale.US);
	    System.out.println(formatter.format(LocalDateTime.now()));
	}
}
