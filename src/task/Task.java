package task;

import calendar.Dates;
import calendar.Time;

import java.time.LocalDate;
import java.time.LocalTime;

import calendar.Time;

public class Task {
	private Dates dateOfTask;
	private Time timeOfTask;
	private String toDo;
	
	
	LocalDate date = LocalDate.of(dateOfTask.getYear(), dateOfTask.getMonth(), dateOfTask.getDay());
	LocalTime timeStart = LocalTime.of(timeOfTask.getHourStart(), timeOfTask.getMinStart());
	LocalTime timeEnd = LocalTime.of(timeOfTask.getHourEnd(), timeOfTask.getMinEnd());
	
	public Task(String toDo, LocalDate date, LocalTime timeStart, LocalTime timeEnd) {
		this.toDo = toDo;
		this.date = date;
		this.timeStart = timeStart;
		this.timeEnd = timeEnd;
	}
	
}
