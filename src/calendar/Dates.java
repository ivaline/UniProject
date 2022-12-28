package calendar;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.time.LocalDate;
import java.time.LocalDateTime;



public class Dates {
	private int day;
	private int month;
	private int year;
	
	
	public Dates(int year, int month, int day) {
		this.year = year;
		this.month = month;
		this.day = day;
	}

	public GregorianCalendar fromDatesToGC() {
		GregorianCalendar dateOfTask = new GregorianCalendar();
		dateOfTask.set(Calendar.DAY_OF_MONTH, this.day);
		dateOfTask.set(Calendar.MONTH, this.month);
		dateOfTask.set(Calendar.YEAR, this.year);
		return dateOfTask;
	}

	public int getDay() {
		return day;
	}


	public void setDay(int day) {
		this.day = day;
	}


	public int getMonth() {
		return month;
	}


	public void setMonth(int month) {
		this.month = month;
	}


	public int getYear() {
		return year;
	}


	public void setYear(int year) {
		this.year = year;
	}
	

}
