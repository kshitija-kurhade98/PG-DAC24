package com.app.Entities;

import java.io.Serializable;
import java.time.LocalDate;

//
//Item Code ( String) : primary key
//Description : String
//Price : double
//Shipment Date : Date


public class Item implements Serializable{
	
	private String itemCode;
	private String desc;
	private double price;
	private LocalDate shipDate;
	
	
	public Item(String itemCode, String desc, double price, LocalDate shipDate) {
		super();
		this.itemCode = itemCode;
		this.desc = desc;
		this.price = price;
		this.shipDate = shipDate;
	}


	public String getItemCode() {
		return itemCode;
	}


	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}


	public String getDesc() {
		return desc;
	}


	public void setDesc(String desc) {
		this.desc = desc;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public LocalDate getShipDate() {
		return shipDate;
	}


	public void setShipDate(LocalDate shipDate) {
		this.shipDate = shipDate;
	}


	@Override
	public String toString() {
		return "Item [itemCode=" + itemCode + ", desc=" + desc + ", price=" + price + ", shipDate=" + shipDate + "]";
	}
	
	
	

}
