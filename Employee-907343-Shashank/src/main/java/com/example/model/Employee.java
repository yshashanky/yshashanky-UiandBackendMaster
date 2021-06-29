package com.example.model;


	import javax.persistence.Entity;
	import javax.persistence.Id;
	import javax.persistence.Table;
	//mark class as an Entity 
	@Entity
	//defining class name as Table name

	public class Employee
	{
	//Defining book id as primary key
	@Id

	private int id;

	private String name;

	private int salary;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	}