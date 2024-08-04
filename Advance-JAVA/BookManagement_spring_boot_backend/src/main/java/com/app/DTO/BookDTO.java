package com.app.DTO;

import java.time.LocalDate;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.validation.constraints.NotNull;

import com.app.Entities.Category;

public class BookDTO {

	
	private String title;	
	private Category category;	
	private LocalDate publishdate;	
	private String authorName;	
	private int price;	
	private String publication;
	
	public BookDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BookDTO(String title, Category category, LocalDate publishdate, String authorName, int price,
			String publication) {
		super();
		this.title = title;
		this.category = category;
		this.publishdate = publishdate;
		this.authorName = authorName;
		this.price = price;
		this.publication = publication;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public LocalDate getPublishdate() {
		return publishdate;
	}

	public void setPublishdate(LocalDate publishdate) {
		this.publishdate = publishdate;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getPublication() {
		return publication;
	}

	public void setPublication(String publication) {
		this.publication = publication;
	}

	@Override
	public String toString() {
		return "BookDTO [title=" + title + ", category=" + category + ", publishdate=" + publishdate + ", authorName="
				+ authorName + ", price=" + price + ", publication=" + publication + "]";
	}
	
	
	
}
