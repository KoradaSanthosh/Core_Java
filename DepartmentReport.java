package org.postgresq.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "DepartmentReport")
public class DepartmentReport {
	
	//To make a primary key we will use @id
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name="dreport_name")
	private String name;
	
	@Column(name="dreport_description")
	private String description;
	
	//Default constructor to address the class
	public DepartmentReport() {
		super();
		
	}

	//Parameterized constructor to store data values
	public DepartmentReport(long id, String name, String description) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}	
}