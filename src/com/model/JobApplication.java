package com.model;

public class JobApplication {
	private int applicationId;
	static private int jobId;
	static private int applicantId;
	private String applicationDate;
	private String coverLetter;
	public JobApplication() {
		super();
		// TODO Auto-generated constructor stub
	}
	public JobApplication(int applicationId, int jobId, int applicantId, String applicationDate, String coverLetter) {
		super();
		this.applicationId = applicationId;
		JobApplication.jobId = jobId;
		JobApplication.applicantId = applicantId;
		this.applicationDate = applicationDate;
		this.coverLetter = coverLetter;
	}
	@Override
	public String toString() {
		return "JobApplication [applicationId=" + applicationId + ", jobId=" + jobId + ", applicantId=" + applicantId
				+ ", applicationDate=" + applicationDate + ", coverLetter=" + coverLetter + "]";
	}
	public int getApplicationId() {
		return applicationId;
	}
	public void setApplicationId(int applicationId) {
		this.applicationId = applicationId;
	}
	public int getJobId() {
		return jobId;
	}
	public void setJobId(int jobId) {
		JobApplication.jobId = jobId;
	}
	public int getApplicantId() {
		return applicantId;
	}
	public void setApplicantId(int applicantId) {
		JobApplication.applicantId = applicantId;
	}
	public String getApplicationDate() {
		return applicationDate;
	}
	public void setApplicationDate(String applicationDate) {
		this.applicationDate = applicationDate;
	}
	public String getCoverLetter() {
		return coverLetter;
	}
	public void setCoverLetter(String coverLetter) {
		this.coverLetter = coverLetter;
	}

}
