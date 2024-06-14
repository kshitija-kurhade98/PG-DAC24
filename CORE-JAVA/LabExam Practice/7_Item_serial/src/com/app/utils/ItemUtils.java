package com.app.utils;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.app.Entities.Item;

public class ItemUtils {

	public static List<Item> populateList(){
		
//		String itemCode, String desc, double price, LocalDate shipDate
		Item i1 = new Item("I2","Desc1",30.00,LocalDate.parse("2024-01-09"));
		Item i2 = new Item("I1","Desc2",350.00,LocalDate.parse("2024-03-11"));
		Item i3 = new Item("I5","Desc3",400.70,LocalDate.parse("2023-11-29"));
		Item i4 = new Item("I9","Desc4",230.25,LocalDate.parse("2024-05-25"));
		Item i5 = new Item("I8","Desc5",550.00,LocalDate.parse("2024-04-08"));
		
		Item[] items = {i1,i2,i3,i4,i5};
		List<Item> list = new ArrayList<>();
		for(Item i : items) {
			list.add(i);
		}
		return list;
		
	}
}
