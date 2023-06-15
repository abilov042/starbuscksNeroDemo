package starbuscksNeroDemo.entities.concetes;

import java.time.LocalDate;

import starbuscksNeroDemo.entities.abstacts.Entity;

public class Customer implements Entity {
	private int id;
	private long nationalityId;
	private String firstName;
	private String lastName;
	private LocalDate dateOfYear;
	
	public Customer(int id, long nationalityId, String firstName, String lastName, LocalDate dateOfYear) {
		super();
		this.id = id;
		this.nationalityId = nationalityId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfYear = dateOfYear;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public long getNationalityId() {
		return nationalityId;
	}

	public void setNationalityId(long nationalityId) {
		this.nationalityId = nationalityId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public LocalDate getDateOfYear() {
		return dateOfYear;
	}

	public void setDateOfYear(LocalDate dateOfYear) {
		this.dateOfYear = dateOfYear;
	}
	
}
