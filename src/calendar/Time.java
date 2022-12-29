package calendar;
import java.util.Calendar;
import java.util.GregorianCalendar;


public class Time {
	private int hour;
	private int min;
	/*To think about changing it like this(if success -> do the same with Dates):
	 * public class MyClass {
  		private SimpleDateFormat format = new SimpleDateFormat("HH-mm-ss");
  		private Calendar calendar = Calendar.getInstance();*/
	
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
