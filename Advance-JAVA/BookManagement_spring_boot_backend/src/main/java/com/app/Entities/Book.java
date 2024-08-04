package com.app.Entities;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "books")
public class Book {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@NotNull
	private String title;
	@NotNull
	@Enumerated(EnumType.STRING)
	private Category category;
	@NotNull
	private LocalDate publishdate;
	@NotNull
	private String authorName;
	@NotNull
	private int price;
	@NotNull
	private String publication;
	
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Book(Long id, @NotNull String title, @NotNull Category category, @NotNull LocalDate publishdate,
			@NotNull String authorName, @NotNull int price, @NotNull String publication) {
		super();
		this.id = id;
		this.title = title;
		this.category = category;
		this.publishdate = publishdate;
		this.authorName = authorName;
		this.price = price;
		this.publication = publication;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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
		return "Book [id=" + id + ", title=" + title + ", category=" + category + ", publishdate=" + publishdate
				+ ", authorName=" + authorName + ", price=" + price + ", publication=" + publication + "]";
	}
	
	
	
	
	
}
