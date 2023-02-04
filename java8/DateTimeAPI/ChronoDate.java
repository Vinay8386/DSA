package DateTimeAPI;

import java.time.chrono.ChronoLocalDate;
import java.time.chrono.Chronology;
import java.util.Set;

public class ChronoDate {
	public static void main(String[] args) {
		
		Set<Chronology> chronos = Chronology.getAvailableChronologies();
		
		for (Chronology chrono : chronos) {

			ChronoLocalDate date = chrono.dateNow();
			System.out.printf("   %20s: %s%n", chrono.getId(), date.toString());

		}

	}
}
