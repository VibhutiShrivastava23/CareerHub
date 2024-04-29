package com.dao;

import java.sql.SQLException;
import java.util.List;

import com.model.Applicant;
import com.model.JobApplication;
import com.model.JobListing;

public interface CompanyDao {

	List<JobListing> findAll() throws SQLException;
	int save(JobApplication jobApplication)throws SQLException;

	List<Applicant> findAlla()throws SQLException;
	int save(JobListing jobListing) throws SQLException;


}
