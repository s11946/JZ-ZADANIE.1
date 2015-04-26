package com.javaZa.zadanie1;

public class User {
	
	private String firstName;
	private String lastName;
	private String email;
	private String repeatEmail;
	private String company;
	private String job;
	private String info;
	
	public User(String firstName, String lastName, String email, String repeatEmail, 
			String company, String job, String info) {
		super();
		this.firstName=firstName;
		this.lastName=lastName;
		this.email=email;
		this.repeatEmail=repeatEmail;
		this.company=company;
		this.job=job;
		this.info=info;
	}

	@Override
	public String toString() {
		return "User [firstName=" + firstName + ", lastName=" + lastName
				+ ", email=" + email + ", repeatEmail=" + repeatEmail
				+ ", company=" + company + ", job=" + job + ", info=" + info
				+ "]";
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getRepeatEmail() {
		return repeatEmail;
	}

	public void setRepeatEmail(String repeatEmail) {
		this.repeatEmail = repeatEmail;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}
	
	

}
