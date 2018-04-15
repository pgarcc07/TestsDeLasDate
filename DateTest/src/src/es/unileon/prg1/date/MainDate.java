package src.es.unileon.prg1.date;

public class MainDate {

	public static void main(String[] args) {
		try {
			Date today, tomorrow;
			today = new Date(20, 3, 2018);
			tomorrow = new Date(21, 3, 2018);
			System.out.println(today.toString());
			System.out.println(today + " isSameYear " + tomorrow + "? " + today.isSameYear(tomorrow));
			System.out.println(today + " isSameMonth " + tomorrow + "? " + today.isSameMonth(tomorrow));
			System.out.println(today + " isSameDay " + tomorrow + "? " + today.isSameDay(tomorrow));
			System.out.println(today + " isSame " + tomorrow + "? " + today.isSame(tomorrow));

			System.out.println("Mes: " + today.getMonthName());

			System.out.println("¿El dia existe? " + today.daysOfMonth());

			System.out.println("La estacion es: " + today.getSeasonName());

			System.out.println("Meses restantes: " + today.getMonthsLeft());

			System.out.println("Dias hasta final de mes: " + today.daysLeft());

			System.out.println("Los meses con mismo numero de dias: " + today.monthCount());

			System.out.println("Numero de dias desde el comienzo del anio: " + today.daysSinceNewYear());
	
			System.out.println("Numero de intentos: " + today.randomDateDoWhile());

			System.out.println("Numero de intentos: " + today.randomDateWhile());

			System.out.println("Numero de intentos: " + today.dayOfWeek());
		}
		catch (DateException e){
			System.out.println(e.getMessage());
		}
	}
}
