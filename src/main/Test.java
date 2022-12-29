package main;
import java.util.logging.Logger;

import calendar.Dates;

public class Test {
	private static Dates date;
	
	static void main(String[] args) {
		System.out.println("Hello");
		date.setDay(7);
		date.setMonth(2);
		date.setYear(2004);
		Logger logger = new Logger(null);
		logger.log(null, "Мой день рождения:"+date);
	}
}
