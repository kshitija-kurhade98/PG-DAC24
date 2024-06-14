package com.app.Tester;

import java.io.BufferedReader;
import java.io.FileReader;
import java.time.LocalDate;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

import com.app.Entities.Item;
import com.app.ordering.ItemCodeComparator;
import com.app.ordering.ItemPriceComparator;
import com.app.utils.ItemUtils;
import static com.app.utils.IoUtils.*;
//writeDataSer;
//Create Tester Java Application to accept Item details from user (minimum -- 5 items) using Scanner.
//Store them in a suitable data structure.
//Sort these details as per Item code. Store them in binary file using serialization technique, before terminating from application.(file name : items_code.ser)
//Sort these details as per Item price. Store them in binary file using serialization technique, before terminating from application

public class ItemApp {
	
	public static void main(String args[]) {
		try(Scanner sc = new Scanner(System.in)){
		
			boolean exit = false;
			List<Item> list = ItemUtils.populateList();
			
			while(!exit) {
				System.out.println("\n----------MENU-----------\n0.Exit \n1.Add Item \n"
						+ "2.Sort as per ItemCode \n"
						+ "3.Sort as per Price\n"
						+ "4.Display Item List\n"
						+ "5.Sort per Price and store to .data file \n"
						+ "6.Read from .data file\n"
						+ "7. Write sorted data to .ser file\n"
						+ "8. Read from .ser file");
				
				try {
					System.out.println("\nEnter your choice : ");
					
					switch(sc.nextInt()) {
						
					case 0 :
						exit = true;
						System.out.println("Thank You !!");
						break;
						
					case 1 :
//						String itemCode, String desc, double price, LocalDate shipDate
						System.out.println("Enter Details : [ItemCode, Desc, Price, Shipdate]");
						//LocalDate date = LocalDate.parse(sc.next());
						Item newitem = new Item(sc.next(),sc.next(),sc.nextDouble(),LocalDate.parse(sc.next()) );
						list.add(newitem);
						System.out.println("Item Added....");
						break;
						
					case 2 :
						//sort as per code
						LinkedList<Item> sortedlist=new LinkedList<>(list);
						Collections.sort(sortedlist, new ItemCodeComparator());
						for(Item t:sortedlist)
							System.out.println(t);
						break;
						
					case 3 :
						LinkedList<Item> sortedPerPrice = new LinkedList<>(list);
						Collections.sort(sortedPerPrice, new ItemPriceComparator());
						
						for(Item i : sortedPerPrice)
							System.out.println(i);
						break;
						
					case 4 :
						list.forEach(i -> System.out.println(i));
						break;
						
					case 5 :
						try {
						Scanner sc1 = new Scanner(System.in);
						Comparator<Item> comp = (i1,i2) -> ((Double) i1.getPrice()).compareTo(i2.getPrice());
						Stream<Item> sortedStream = list.stream().sorted(comp);
						System.out.println("\nEnter File Name to store Sorted data : ");
						String file = sc1.nextLine();
						writeDetails(sortedStream,file);
						System.out.println("File Written......");
						}catch(Exception e) {
							System.out.println(e);
						}
						break;
						
					case 6 :
						try {
							Scanner sc1 = new Scanner(System.in);
							System.out.println("\nEnter File Name to Read from : ");
							String file = sc1.nextLine();
							BufferedReader  br = new BufferedReader(new FileReader(file)) ;
							
							br.lines().forEach(line-> System.out.println(line));
						}catch(Exception e) {
							System.out.println(e);
						}
						break;
						
					case 7 :
						try {
							LinkedList<Item> sortedList = new LinkedList<>(list);
							Collections.sort(sortedList, new ItemPriceComparator());
							
							Scanner sc1 = new Scanner(System.in);
							System.out.println("\nEnter File Name to write : ");
							String file = sc1.nextLine();
							
							writeDataSer(sortedList,file);
							
						}catch(Exception e) {
							System.out.println(e);
						}
						break;
						
					case 8 :
						try {
							Scanner sc1 = new Scanner(System.in);
							System.out.println("\nEnter File Name to Read from : ");
							String file = sc1.nextLine();
							Object o = readDataSer(file);
							System.out.println(o);
						}catch(Exception e) {
							System.out.println(e);
						}
						break;
					}
					
				}catch(Exception e) {
					System.out.println(e);
				}
			}
		}
	}

}
