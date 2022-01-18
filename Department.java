package org.postgresql.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="departmentdetails")
public class Department {
	
	//To make a primary key we will use @id
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name="name")
	private String name;
	
	//Default constructor to address the class
	public Department() {
		super();
	}
	
	//Parameterized constructor to store data values
	public Department(long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	//Getter and setter method to bind the data
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	

}