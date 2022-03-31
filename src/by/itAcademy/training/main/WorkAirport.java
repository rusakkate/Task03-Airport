package by.itAcademy.training.main;

import by.itAcademy.training.entity.Airline;
import by.itAcademy.training.entity.Airport;

public class WorkAirport {

	public static void main(String[] args) {
		Airport Minsk2 = new Airport ();
		
		Minsk2.createAirline(createAirline(1005, "Mallorca", "Sunday", "18:30"));
		Minsk2.createAirline(createAirline(1010, "Barselona", "Monday", "06:00"));
		Minsk2.createAirline(createAirline(1025, "Berlin", "Monday", "17:20"));
		Minsk2.createAirline(createAirline(1080, "Tenerife", "Thursday", "15:14"));
		Minsk2.createAirline(createAirline(1020, "Mallorca", "Friday", "18:30"));
		Minsk2.createAirline(createAirline(1011, "Cuba", "Friday", "19:10"));
		Minsk2.createAirline(createAirline(1022, "Mallorca", "Wednesday", "07:15"));
		Minsk2.createAirline(createAirline(1026, "Barselona", "Friday", "11:45"));
		
		Minsk2.findFlightDestination();
		Minsk2.findFlightWeekDay();
		Minsk2.findFlightWeekDayAfterTime();

	}
	
	private static Airline createAirline(int flightNumber, String destination, String weekDay, String departureTime) {
		Airline airline = new Airline();
		
		airline.setFlightNumber(flightNumber);
		airline.setDestination(destination);
		airline.setWeekDay(weekDay);
		airline.setDepartureTime(departureTime);

		return airline;
	}

}
