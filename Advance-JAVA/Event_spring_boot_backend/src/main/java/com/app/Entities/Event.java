package com.app.Entities;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "Events")
public class Event {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotNull
	private String name;
	@NotNull
	private String city;
	@NotNull
	private LocalDate date;
	@Enumerated(EnumType.STRING)
	private Type type;
	@NotNull
	private String mobno;
	@NotNull
	private double fees;
	public Event() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Event(Long id, @NotNull String name, @NotNull String city, @NotNull LocalDate date, Type type,
			@NotNull String mobno, @NotNull double fees) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
		this.date = date;
		this.type = type;
		this.mobno = mobno;
		this.fees = fees;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public Type getType() {
		return type;
	}
	public void setType(Type type) {
		this.type = type;
	}
	public String getMobno() {
		return mobno;
	}
	public void setMobno(String mobno) {
		this.mobno = mobno;
	}
	public double getFees() {
		return fees;
	}
	public void setFees(double fees) {
		this.fees = fees;
	}
	@Override
	public String toString() {
		return "Event [id=" + id + ", name=" + name + ", city=" + city + ", date=" + date + ", type=" + type
				+ ", mobno=" + mobno + ", fees=" + fees + "]";
	}
	
	
	
	
	
	
	

}
