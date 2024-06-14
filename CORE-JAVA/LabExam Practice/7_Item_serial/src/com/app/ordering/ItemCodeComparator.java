package com.app.ordering;

import java.util.Comparator;

import com.app.Entities.Item;

public class ItemCodeComparator implements Comparator<Item> {

	@Override
	public int compare(Item o1, Item o2) {
		// TODO Auto-generated method stub
		return o1.getItemCode().compareTo(o2.getItemCode());
	}

	

}
