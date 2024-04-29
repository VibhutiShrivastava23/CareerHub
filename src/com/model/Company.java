package com.model;

public class Company {
	private int companyId;
	private String companyName;
	private String location;
	public Company() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Company(int companyId, String companyName, String location) {
		super();
		this.companyId = companyId;
		this.companyName = companyName;
		this.location = location;
	}
	@Override
	public String toString() {
		return "Company [companyId=" + companyId + ", companyName=" + companyName + ", location=" + location + "]";
	}
	public int getCompanyId() {
		return companyId;
	}
	public void setCompanyId(int companyId) {
		this.companyId = companyId;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	

}
