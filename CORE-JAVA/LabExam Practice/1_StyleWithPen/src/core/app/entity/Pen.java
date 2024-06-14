package core.app.entity;

import java.time.LocalDate;

public class Pen {

	/*
	 * You can define a class Pen with the following fields – 
a.	ID (unique identifier for each Pen, should be generated automatically)
b.	Brand (Example:  Cello, Parker, Reynolds etc.)
c.	Color
d.	InkColor
e.	Material (Example: Plastic, Alloy Steel, Metal etc.)
f.	Stock (Available quantity)
g.	Stock Update Date (it changed every time when admin update stock or user order executed)
h.	Stock Listing Date (date on which product is added to site for sale)
i.	Price (in INR) 
j.	Discounts (in percentage) 
	 */
	
	private static int cnt;
	private int ID;
	private Brand brand;
	private String color;
	private String inkColor;
	private Material material;
	private int stock;
	private LocalDate updateDate;
	private LocalDate listingDate;
	private double price;
	private double discount;
	
	static {
		cnt=100;
	}
	
	public Pen() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Pen(Brand brand, String color, String inkColor, Material material,LocalDate updateDate, int stock,
				double price) {
		super();
		ID = ++cnt;
		this.brand = brand;
		this.color = color;
		this.inkColor = inkColor;
		this.material = material;
		this.stock = stock;
		this.updateDate = updateDate;
		this.listingDate = LocalDate.now();
		this.price = price;
		this.discount = 0;
	}
	
	public Pen(Brand brand, String color, String inkColor, Material material, int stock,
			double price) {
	super();
	ID = ++cnt;
	this.brand = brand;
	this.color = color;
	this.inkColor = inkColor;
	this.material = material;
	this.stock = stock;
	this.updateDate = LocalDate.now();
	this.listingDate = LocalDate.now();
	this.price = price;
	this.discount = 0;
}

	public static int getCnt() {
		return cnt;
	}

	public static void setCnt(int cnt) {
		Pen.cnt = cnt;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public Brand getBrand() {
		return brand;
	}

	public void setBrand(Brand brand) {
		this.brand = brand;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getInkColor() {
		return inkColor;
	}

	public void setInkColor(String inkColor) {
		this.inkColor = inkColor;
	}

	public Material getMaterial() {
		return material;
	}

	public void setMaterial(Material material) {
		this.material = material;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public LocalDate getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(LocalDate updateDate) {
		this.updateDate = updateDate;
	}

	public LocalDate getListingDate() {
		return listingDate;
	}

	public void setListingDate(LocalDate listingDate) {
		this.listingDate = listingDate;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	@Override
	public String toString() {
		return "Pen [ID=" + ID + ", brand=" + brand + ", color=" + color + ", inkColor=" + inkColor + ", material="
				+ material + ", stock=" + stock + ", updateDate=" + updateDate + ", listingDate=" + listingDate
				+ ", price=" + price + ", discount=" + discount + "]";
	}
	
	
	
}
