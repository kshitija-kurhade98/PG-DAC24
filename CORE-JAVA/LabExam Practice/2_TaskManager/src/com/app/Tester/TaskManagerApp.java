package com.app.Tester;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Map;
import java.util.Scanner;

import com.app.Entities.Task;
import com.app.Ordering.TakDateComparator;
import com.app.Utils.TaskUtils;

/*
 * Following functionalities are expected -

1. Add New Task                       
2. Delete a task                         
3. Update task status               
4. Display all pending tasks     
5. Display all pending tasks for today           
6.  Display all tasks sorted by taskDate 
 */


public class TaskManagerApp {

	public static void main(String[] args) {
		
		try(Scanner sc = new Scanner(System.in)){
			
			boolean exit = false;
			Map<Integer,Task> tasksMap = TaskUtils.populateTaskMap();
			
			while(!exit) {
				System.out.println("\n-----------MENU----------\n"
						+ "0. Exit \n"
						+ "1. Add New Task\r\n"
						+ "2. Delete a task \r\n"
						+ "3. Update task status \n"
						+ "4. Display all pending tasks \r\n"
						+ "5. Display all pending tasks for today \r\n"
						+ "6. Display all tasks sorted by taskDate \n"
						+ "7. Display all tasks");
				try {
					System.out.println("\n Enter Choice : ");
					switch(sc.nextInt()) {
					
					case 1:
//						a. Add New Task 
//						String taskName, String desc 
						System.out.println("\nEnter Task Details : [TaskName, Description]");
						Task task = new Task(sc.next(),sc.next());
						tasksMap.put(task.getTaskId(), task);
						System.out.println("\nNew Task Added Success....");
						break;
						
					case 2 :
//						2. Delete a task
						System.out.println("\nEnter Task Id : ");
						TaskUtils.removeTask(sc.nextInt(), tasksMap);
						break;
						
					case 3 :
//						3. Update task status
						System.out.println("Enter Task Id : ");
						TaskUtils.updateTaskStatus(sc.nextInt(), tasksMap);
						break;
						
					case 4 :
//						4. Display all pending tasks
						System.out.println("\n Pending Tasks : \n");
						TaskUtils.displayAllPendingTasks(tasksMap);
						break;
						
					case 5 :
//						5. Display all pending tasks for today
						TaskUtils.pendingTasksForToday(tasksMap);
						break;
						
					case 6 :
//						6. Display all tasks sorted by taskDate
						LinkedList<Task> list = new LinkedList<>(tasksMap.values());
						Collections.sort(list, new TakDateComparator());
						for(Task t : list)
							System.out.println(t);
						break;
						
					case 7 :
						tasksMap.forEach((k,v)-> System.out.println(v));
						break;
						
					case 0 :
						exit = true;
						System.out.println("Thank You !");
						
						
					}
					
					
				}catch(Exception e) {
					System.out.println(e);
				}
			}
		}

	}

}
