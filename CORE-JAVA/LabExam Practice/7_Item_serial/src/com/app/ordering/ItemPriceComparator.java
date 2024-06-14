package com.app.ordering;

import java.util.Comparator;

import com.app.Entities.Item;

public class ItemPriceComparator implements Comparator<Item> {

	@Override
	public int compare(Item o1, Item o2) {
		
		return ((Double) o1.getPrice()).compareTo(o2.getPrice());
	}

}
