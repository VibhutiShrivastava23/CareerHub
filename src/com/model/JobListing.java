package com.model;

public class JobListing {
	private int jobId;
	
	private String jobTitle;
	private String jobDescription;
	private String jobLocation;
	private double salary;
	private String jobType;
	private String postedDate;
	
	static private int companyId;
	public JobListing(int jobid2, int companyid2, String location, double salary2, String type, String date) {
		super();
		// TODO Auto-generated constructor stub
	}
	public JobListing(int jobId, int companyId, String jobTitle, String jobDescription, String jobLocation,
			double salary, String jobType, String postedDate) {
		super();
		this.jobId = jobId;
		JobListing.companyId = companyId;
		this.jobTitle = jobTitle;
		this.jobDescription = jobDescription;
		this.jobLocation = jobLocation;
		this.salary = salary;
		this.jobType = jobType;
		this.postedDate = postedDate;
	}
	@Override
	public String toString() {
		return "JobListing [jobId=" + jobId + ", companyId=" + companyId + ", jobTitle=" + jobTitle
				+ ", jobDescription=" + jobDescription + ", jobLocation=" + jobLocation + ", salary=" + salary
				+ ", jobType=" + jobType + ", postedDate=" + postedDate + "]";
	}
	public int getJobId() {
		return jobId;
	}
	public void setJobId(int jobId) {
		this.jobId = jobId;
	}
	public int getCompanyId() {
		return companyId;
	}
	public void setCompanyId(int companyId) {
		JobListing.companyId = companyId;
	}
	public String getJobTitle() {
		return jobTitle;
	}
	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}
	public String getJobDescription() {
		return jobDescription;
	}
	public void setJobDescription(String jobDescription) {
		this.jobDescription = jobDescription;
	}
	public String getJobLocation() {
		return jobLocation;
	}
	public void setJobLocation(String jobLocation) {
		this.jobLocation = jobLocation;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getJobType() {
		return jobType;
	}
	public void setJobType(String jobType) {
		this.jobType = jobType;
	}
	public String getPostedDate() {
		return postedDate;
	}
	public void setPostedDate(String postedDate) {
		this.postedDate = postedDate;
	}
	

}
