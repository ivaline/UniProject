package task;
import task.Task;
import calendar.Time;

public class PauseInfo {
	private int freq;
	private int length;
	private Task task1;
	
	/* So here I'm going to create a class Pause. It takes
	 * as parameters how many times a person wants to take a break
	 * and how long those pauses will be*/
	public PauseInfo(int freq,int length) {
		this.freq = freq;
		this.length = length;
	}
	
	/*Here I'm applying those parameters and adjusting
	 * time for the task so all the breaks will fit in*/
	
	public void applyPause(PauseInfo pauseInfo, Task task) {
		
	}
	
	
}
