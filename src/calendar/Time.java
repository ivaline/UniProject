package calendar;
import java.util.Calendar;
import java.util.GregorianCalendar;


public class Time {
	private int hour;
	private int min;
	
	
	public Time(int hour,int min) {
		this.hour = hour;
		this.min = min;
	}
	
	


	public int getHour() {
		return hour;
	}


	public void setHour(int hour) {
		this.hour = hour;
	}


	public int getMin() {
		return min;
	}


	public void setMin(int min) {
		this.min = min;
	}




}
