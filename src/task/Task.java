package task;

import calendar.Dates;
import calendar.Time;
import java.util.Calendar;
import java.util.GregorianCalendar;



public class Task {
	private Dates dateOfTask;
	private Time timeStart;
	private Time timeEnd;
	private String toDo;
	
	GregorianCalendar date = new GregorianCalendar();

	
	
	public Task(String toDo, Time timeStart, Time timeEnd, Dates dateOfTask) {
		
		this.toDo = toDo;
		
	}
	
}
