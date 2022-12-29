package task;

import java.util.GregorianCalendar;

import calendar.Dates;
import calendar.Time;

public class Pause extends Task{

	public Pause(String toDo, GregorianCalendar timeOfStart, GregorianCalendar timeOfEnd,
			GregorianCalendar dateOfPause) {
		super(toDo, timeOfStart, timeOfEnd, dateOfPause);
	}

}
