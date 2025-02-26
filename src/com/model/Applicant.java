package com.model;

public class Applicant {
	private int applicantId;
	private String firstName;
	private String lastName;
	private String email;
	private int phone;
	private String resume;
	public Applicant() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Applicant(int applicantId, String firstName, String lastName, String email, int phone, String resume) {
		super();
		this.applicantId = applicantId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phone = phone;
		this.resume = resume;
	}
	@Override
	public String toString() {
		return "Company [applicantId=" + applicantId + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", email=" + email + ", phone=" + phone + ", resume=" + resume + "]";
	}
	public int getApplicantId() {
		return applicantId;
	}
	public void setApplicantId(int applicantId) {
		this.applicantId = applicantId;
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
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
	public String getResume() {
		return resume;
	}
	public void setResume(String resume) {
		this.resume = resume;
	}

}
