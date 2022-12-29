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
		this.timeStart = timeStart;
		this.timeEnd = timeEnd;
		this.dateOfTask = dateOfTask;
		
	}



	public Dates getDateOfTask() {
		return dateOfTask;
	}



	public void setDateOfTask(Dates dateOfTask) {
		this.dateOfTask = dateOfTask;
	}



	public Time getTimeStart() {
		return timeStart;
	}


	public Time getTimeEnd() {
		return timeEnd;
	}



	public String getToDo() {
		return toDo;
	}



	public void setToDo(String toDo) {
		this.toDo = toDo;
	}
	
	
}
