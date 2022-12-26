package calendar;
import java.util.Calendar;
import java.util.Date;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Duration;

public class Time {
	private int hourStart;
	private int minStart;
	private int hourEnd;
	private int minEnd;
	
	
	public Time(int hourStart,int minStart, int hourEnd, int minEnd) {
		this.hourStart = hourStart;
		this.minStart = minStart;
		this.hourEnd = hourEnd;
		this.minEnd = minEnd;
	}


	public int getHourStart() {
		return hourStart;
	}


	public void setHourStart(int hourStart) {
		this.hourStart = hourStart;
	}


	public int getMinStart() {
		return minStart;
	}


	public void setMinStart(int minStart) {
		this.minStart = minStart;
	}


	public int getHourEnd() {
		return hourEnd;
	}


	public void setHourEnd(int hourEnd) {
		this.hourEnd = hourEnd;
	}


	public int getMinEnd() {
		return minEnd;
	}


	public void setMinEnd(int minEnd) {
		this.minEnd = minEnd;
	}

}
