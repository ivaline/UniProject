package calendar;

import task.Task;

import javax.swing.*;
import javax.swing.table.*;
import java.awt.*;

public class TimeTable {
	private JTable calendar;
	private Task task;
	
	public TimeTable(JTable calendar) {
		this.calendar = calendar;
	}
	
	public void createDate(JTable calendar, Task task) {
		
		
	}
	
	public void addTaskToTable(JTable calendar, Task task) {
		/* Если ещё не существует дата, то мы отправляемся в createDate
		 *  и затем возвращаемся сюда, там просто создаем дату */
		
	}
	
}
