package calendar;

import task.Task;
import javax.swing.*;
import javax.swing.table.*;
import java.awt.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.TimeZone;   
import java.util.Locale;   
import java.util.Calendar;   
import java.util.GregorianCalendar;   

public class TimeTable {
	private JTable calendar;
	private Task task;
	private String[] days;

	
	public TimeTable(JTable calendar) {
		this.calendar = calendar;
	}
	
	public static void main(String[] args) {
		GregorianCalendar calendar = new GregorianCalendar();
		JTable table = new JTable(10, 10);
		table.setAutoCreateColumnsFromModel(false);
		DefaultTableModel model = (DefaultTableModel)table.getModel();
		
		  for (int i = 0; i < 10; i++) {
		  TableColumn col = new TableColumn();
		  TableColumn s=Integer.toString(calendar.get(Calendar.DATE));
		  JTable.addColumn(col);
		  for(String columnName : columnNames){
			   tableModel.addColumn(columnName);
			}

			jTable.setModel(tableModel);
		  }
	}
	public void columnNames(String[] ads) {          
	        // create old date in string format  
	        String dateBefore = "2022-12-29";    
	        System.out.println(dateBefore+" is the date before adding days");  
	          
	        // create instance of the SimpleDateFormat that matches the given date  
	        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");  
	          
	        //create instance of the Calendar class and set the date to the given date  
	        Calendar cal = Calendar.getInstance();  
	        try{  
	           cal.setTime(sdf.parse(dateBefore));  
	        }catch(ParseException e){  
	            e.printStackTrace();  
	         }  
	             
	        // use add() method to add the days to the given date  
	        cal.add(Calendar.DAY_OF_MONTH, 7);  
	        String dateAfter = sdf.format(cal.getTime());  
	          
	        //date after adding three days to the given date  
	        System.out.println(dateAfter+" is the date after adding 3 days.");   
	}

	public void addTaskToTable(JTable calendar, Task task) {
		/* Если ещё не существует дата, то мы отправляемся в createDate
		 *  и затем возвращаемся сюда, там просто создаем дату */
		
	}
	
}
