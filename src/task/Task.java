package task;

import calendar.Dates;
import calendar.Time;
import java.util.Calendar;
import java.util.GregorianCalendar;



public class Task {
	private static Dates dateTask;
	private static Time timeStart;
	private static Time timeEnd;
	private String toDo;
	
	static GregorianCalendar dateOfTask = new GregorianCalendar();
	static GregorianCalendar timeOfStart = new GregorianCalendar();
	static GregorianCalendar timeOfEnd = new GregorianCalendar();
	

	public static void main (String args[]) {
		dateOfTask.set(Calendar.DAY_OF_MONTH, dateTask.getDay());
		dateOfTask.set(Calendar.MONTH, dateTask.getMonth());
		dateOfTask.set(Calendar.YEAR, dateTask.getYear());
		
		timeOfStart.set(Calendar.HOUR, timeStart.getHour());
		timeOfStart.set(Calendar.MINUTE, timeStart.getMin());
		
		timeOfEnd.set(Calendar.HOUR, timeEnd.getHour());
		timeOfEnd.set(Calendar.MINUTE, timeEnd.getMin());
	}
	
	public Task(String toDo, GregorianCalendar timeOfStart, GregorianCalendar timeOfEnd, GregorianCalendar dateOfTask) {
		this.toDo = toDo;
		Task.timeOfStart = timeOfStart;
		Task.timeOfEnd = timeOfEnd;
		Task.dateOfTask = dateOfTask;
		
	}

	public String getToDo() {
		return toDo;
	}

	public void setToDo(String toDo) {
		this.toDo = toDo;
	}

	public static GregorianCalendar getDateOfTask() {
		return dateOfTask;
	}

	public static void setDateOfTask(GregorianCalendar dateOfTask) {
		Task.dateOfTask = dateOfTask;
	}

	public static GregorianCalendar getTimeOfStart() {
		return timeOfStart;
	}

	public static void setTimeOfStart(GregorianCalendar timeOfStart) {
		Task.timeOfStart = timeOfStart;
	}

	public static GregorianCalendar getTimeOfEnd() {
		return timeOfEnd;
	}

	public static void setTimeOfEnd(GregorianCalendar timeOfEnd) {
		Task.timeOfEnd = timeOfEnd;
	}


}