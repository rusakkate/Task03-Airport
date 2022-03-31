package by.itAcademy.training.entity;

public class Airline {
	private int flightNumber;
	private String destination;
	private String airlineType;
	private String weekDay;
	private String departureTime;
	
	public Airline (int flightNumber, String destination, String weekDay, String departureTime) {
		this.getFlightNumber();
		this.destination = destination;
		this.getWeekDay();
		this.departureTime = departureTime;
	}
	
	public Airline () {
		
	}
	
	public int getFlightNumber() {
		return flightNumber;
	}
	public String getDestination() {
		return destination;
	}
	public String getAirlineType() {
		return airlineType;
	}
	public String getWeekDay() {
		return weekDay;
	}
	public String getDepartureTime() {
		return departureTime;
	}
	public void setFlightNumber(int flightNumber) {
		if (flightNumber < 0) {
			throw new RuntimeException ("Uncorrect flightNumber");
		} else {
			this.flightNumber = flightNumber;
		}
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public void setAirlineType(String airlineType) {
		this.airlineType = airlineType;
	}
	public void setWeekDay(String weekDay) {
		String [] listWeekDay = new String [] {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
		boolean wd;
		wd = false;
		for (int i = 0; i < listWeekDay.length; i++) {
			if (weekDay == listWeekDay[i]) {
				wd = true;
				break;
			}
		}
		if (wd == true) {
			this.weekDay = weekDay;
		} else {
			throw new RuntimeException ("Uncorrect weekDay");
		}
		
	}
	public void setDepartureTime(String departureTime) {
		this.departureTime = departureTime;
	}
	
	public String toString () {
		String str = "";
		str = str + flightNumber + ": " + destination + ", " + weekDay + ", " + departureTime;
		return str;
	}


}
