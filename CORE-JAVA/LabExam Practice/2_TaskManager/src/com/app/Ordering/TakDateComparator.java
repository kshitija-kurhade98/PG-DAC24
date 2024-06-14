package com.app.Ordering;

import java.util.Comparator;

import com.app.Entities.Task;

public class TakDateComparator implements Comparator<Task> {

	@Override
	public int compare(Task t1, Task t2) {
		System.out.println("In TaskDateComparator");
		
		return t1.getTaskDate().compareTo(t2.getTaskDate());
	}
	
	

}
