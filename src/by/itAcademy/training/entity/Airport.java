package by.itAcademy.training.entity;

import java.util.Scanner;

public class Airport {
	private Airline [] airlines;
	private int sizeAirport;
	private int numberAirlines;
	
	private static final int DEFAULTSIZE = 5;
	
	public Airport (int sizeAirport) {
		numberAirlines = 0;
		this.sizeAirport = sizeAirport;
		airlines = new Airline [sizeAirport];
	}
	
	public Airport () {
		this (DEFAULTSIZE);
	}
	
	public Airline[] getAirlines() {
		return airlines;
	}

	public int getSizeAirport() {
		return sizeAirport;
	}

	public int getNumberAirlines() {
		return numberAirlines;
	}

	public void setAirlines(Airline[] airlines) {
		this.airlines = airlines;
	}

	public void setSizeAirport(int sizeAirport) {
		this.sizeAirport = sizeAirport;
	}

	public void setNumberAirlines(int numberAirlines) {
		this.numberAirlines = numberAirlines;
	}

	public void createAirline (Airline airline) {
		if (numberAirlines < sizeAirport) {
			airlines [numberAirlines] = airline;
			numberAirlines++;
		} else {
			Airline[] buffer = new Airline [sizeAirport * 2];
			for (int i = 0; i < numberAirlines; i++) {
				buffer[i] = airlines[i];
			}
			airlines = buffer;
			sizeAirport = sizeAirport * 2;
			airlines[numberAirlines] = airline;
			numberAirlines++;
		}
	}
	
	public void print () {
		for (int i = 0; i < numberAirlines; i++) {
			System.out.println(airlines[i].toString());
		}
	}
	
	public void findFlightDestination () {
		Scanner sc = new Scanner (System.in);
		System.out.println ("Enter destination ");
		String findFlightDestination = sc.nextLine();
		System.out.println ("Flight to selected destination: ");
		for (int i = 0; i < numberAirlines; i++) {
			if (findFlightDestination.equals(airlines[i].getDestination())) {
				System.out.println(airlines[i].toString());
			}
		}
	}
	
	public void findFlightWeekDay () {
		Scanner sc = new Scanner (System.in);
		System.out.println ("Enter week day ");
		String findFlightWeekDay = sc.nextLine();
		System.out.println ("Flight to selected week day: ");
		for (int i = 0; i < numberAirlines; i++) {
			if (findFlightWeekDay.equals(airlines[i].getWeekDay())) {
				System.out.println(airlines[i].toString());
			}
		}
	}
	
	public void findFlightWeekDayAfterTime () {
		Scanner sc = new Scanner (System.in);
		System.out.println ("Enter week day ");
		String findFlightWeekDay = sc.nextLine();
		System.out.println ("Enter time ");
		String findAfterTime = sc.nextLine();
		
		System.out.println ("Flight to selected week day after time " + findAfterTime + ": ");
		for (int i = 0; i < numberAirlines; i++) {
			if (findFlightWeekDay.equals(airlines[i].getWeekDay()) & airlines[i].getDepartureTime().compareTo(findAfterTime) > 0) {
				System.out.println(airlines[i].toString());
			}
		}
	}

}
