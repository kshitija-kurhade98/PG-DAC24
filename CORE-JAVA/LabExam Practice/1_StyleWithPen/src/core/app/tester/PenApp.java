package core.app.tester;

import java.util.Map;
import java.util.Scanner;
import core.app.entity.Pen;
import core.app.utilities.PenUtils;
import core.app.validations.PenValidations;


public class PenApp {

	public static void main(String[] args) {
		
		try(Scanner sc = new Scanner(System.in)){
			
			boolean exit = false;
			Map<Integer,Pen> penMap = PenUtils.populateMap();
			
			while(!exit) {
				System.out.println("\n ------------MENU------------\n"
						+ "\n0. Exit \n1. Add new Pen\r\n"
						+ "2. Update stock of a Pen\r\n"
						+ "3. Set discount of 20% for all the pens which are not at all sold in last 3 months\r\n"
						+ "4. Remove Pens which are never sold once listed in 9 months\r\n"
						+ "5. Display Stock");
				try{
					System.out.println("\n Enter Choice : ");
					
					switch(sc.nextInt()) {
					
					case 0 :
						System.out.println("Thank You!!");
						exit = true;
						break;
					
					case 1 :
						//1. Add new Pen
						//Brand brand, String color, String inkColor, Material material,
						//int stock,double price
						System.out.println("\nEnter Pen Details : [Brand, Color, inkColor, Material,Stock, Price] ");
						Pen pen = PenValidations.validateInputs(sc.next(),sc.next(),sc.next(),sc.next(),sc.nextInt(),sc.nextDouble());
						penMap.put(pen.getID(), pen);
						System.out.println("\nPen Added....!!");
						break;
						
					case 2 :
						// 2. Update stock of aPen
						System.out.println("\nEnter PenId nd Stock : ");
						PenUtils.updateStock(sc.nextInt(), sc.nextInt(), penMap);
						break;
						
					case 3 :
						//3. Set discount of 20% for all the pens which are not at all sold in last 3 months
						PenUtils.setDiscountForPen(penMap);
						break;
						
					case 4 :
						//4. Remove Pens which are never sold once listed in 9 months
						PenUtils.removePen(penMap);
						break;
						
					case 5 :
						penMap.forEach((k,v)-> System.out.println(v));
						break;
					
				
					}
					
				}catch(Exception e) {
					System.out.println(e);
				}
			}
		}

	}

}
