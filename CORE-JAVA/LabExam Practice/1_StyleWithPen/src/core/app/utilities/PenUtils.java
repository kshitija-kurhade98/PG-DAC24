package core.app.utilities;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

import core.app.entity.Brand;
import core.app.entity.Material;
import core.app.entity.Pen;
import core.app.exceptions.PenNotFoundException;

public class PenUtils {

	//populateMethod
	public static Map<Integer, Pen> populateMap(){
		
		//Brand brand, String color, String inkColor, Material material,
		//LocalDate updateDate,int stock,double price
		
		Pen p1 = new Pen(Brand.CELLO,"Green","RED",Material.METAL,LocalDate.parse("2024-02-22"),10,1000);
		Pen p2 = new Pen(Brand.PARKER,"Yellow","BLACK",Material.ALLOYSTEEL,LocalDate.parse("2023-06-25"),20,500);
		Pen p3 = new Pen(Brand.REYNOLD,"Green","BLUE",Material.PLASTIC,LocalDate.parse("2024-05-22"),50,6000);
		Pen p4 = new Pen(Brand.PARKER,"Green","RED",Material.METAL,LocalDate.parse("2024-01-22"), 25,2500);
		Pen p5 = new Pen(Brand.RORITO,"Green","BLUE",Material.METAL,LocalDate.parse("2024-05-22"),5,50);
		
		Pen pens[] = {p1,p2,p3,p4,p5};
		
		Map<Integer,Pen> map = new HashMap<>();
		
		for(Pen p : pens) {
			map.put(p.getID(), p);
		}
		
		return map;
		
	}
	
	public static Pen findPenById(int id, Map<Integer,Pen> pens) {
		for(Pen p : pens.values()) {
			if(p.getID() ==  id ) {
				return p;
			}
		}
		return null;
	}
	
	public static void updateStock(int id, int stock, Map<Integer,Pen> pens) throws PenNotFoundException{
		 Pen pen = findPenById(id,pens);
		 
//		 Pen pen1 = pens.get(id);
		 
		 if(pen!=null) {
			 pen.setStock(stock);
			 pen.setUpdateDate(LocalDate.now());
			 System.out.println("\nStock Updated .. val : "+stock);
		 }else {
			 throw new PenNotFoundException("Pen Not Found!");
		 }
	}
	
	public static void setDiscountForPen(Map<Integer,Pen> pens) {
		LocalDate ago3months = LocalDate.now().minusMonths(3);
		System.out.println("Pens to set discount : (3 months ago)");
		for(Pen p : pens.values()) {
			if(p.getUpdateDate().isBefore(ago3months)) {
				System.out.println(p);
				p.setDiscount(20);
				System.out.println("Discount Set... for 3 months ago pen!");
			}
		}
	}
	
	public static void removePen(Map<Integer,Pen> pens) {
		LocalDate ago9Months = LocalDate.now().minusMonths(9);
		
		System.out.println("\nPens to Remove (9 months Ago) : ");
		for(Pen p : pens.values()) {
			if(p.getUpdateDate().isBefore(ago9Months)) {
				System.out.println(p);
//			 pens.remove(p);
//				return pens;
			}
		}
		
		//pens.values().remove(ago9Months)
		pens.values().removeIf(v->v.getUpdateDate().isBefore(ago9Months));
		//pens.forEach((k,v)->System.out.println());
		System.out.println("Pen Removed....");
		
	}
	
}
