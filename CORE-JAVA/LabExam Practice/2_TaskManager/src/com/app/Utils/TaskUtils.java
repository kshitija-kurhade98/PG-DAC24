package com.app.Utils;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.app.Entities.Status;
import com.app.Entities.Task;
import com.app.Exceptions.TaskNotFoundException;

public class TaskUtils {
	
	public static Map<Integer,Task> populateTaskMap(){
		
		//String taskName, String desc, LocalDate taskDate, Status status, boolean active
		Task t1 = new Task("Task1","T1 Content",LocalDate.parse("2024-05-25"),Status.COMPLETED,false);
		Task t2 = new Task("Task2","T2 Content",LocalDate.parse("2024-06-02"),Status.INPROGRESS,true);
		Task t3 = new Task("Task3","T3 Content",LocalDate.parse("2024-04-10"),Status.PENDING,false);
		Task t4 = new Task("Task4","T4 Content",LocalDate.parse("2024-02-02"),Status.COMPLETED,false);
		Task t5 = new Task("Task5","T5 Content",LocalDate.parse("2024-06-07"),Status.INPROGRESS,true);
		
		Task tasks[] = {t1,t2,t3,t4,t5};
		
		Map<Integer, Task> map = new HashMap<>();
		for(Task t : tasks) {
			map.put(t.getTaskId(), t);
		}
		return map;
		
	}
	
	public static Task findTaskById(int id, Map<Integer,Task> tasks) {
		
		for(Task t : tasks.values()) {
			if(t.getTaskId() == id)
				return t;
		}
		return null;
		
	}

	public static void removeTask(int id, Map<Integer,Task> tasks) {
		Task t = findTaskById(id,tasks);
		System.out.println(t);
		tasks.values().remove(t);
		System.out.println("\nTask Removed.....");
	}
	
	public static void updateTaskStatus(int id, Map<Integer,Task> tasks) {
		Task t = tasks.get(id);
		if(t!=null) {
			Scanner sc = new Scanner(System.in);
			System.out.println("\nEnter Status : [Pending,InProgress,Completed]");
			Status status = Status.valueOf(sc.next().toUpperCase());
			t.setStatus(status);
			System.out.println("Status Updated Successfully....");
		}
	}
	
	public static void displayAllPendingTasks(Map<Integer,Task> tasks) throws TaskNotFoundException {
		
		for(Task t : tasks.values()) {
			if(t.getStatus().equals(Status.PENDING)) {
				System.out.println(t);
			}
//			else {
//				
//				throw new TaskNotFoundException("Task Not Found!");
//			}
		}
//		throw new TaskNotFoundException("Task Not Found!");
	}
	
	public static void pendingTasksForToday(Map<Integer,Task> tasks) throws TaskNotFoundException {
		for(Task t : tasks.values()) {
			if(t.getStatus()==Status.PENDING && t.getTaskDate().equals(LocalDate.now())) {
				System.out.println(t);
			}
//			else {
//				throw new TaskNotFoundException("Task Not Found!");
//			}
		}
	}
	
}
