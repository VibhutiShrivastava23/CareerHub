package com.service;

import java.sql.SQLException;
import java.util.List;

import com.dao.CompanyDao;
import com.dao.CompanyDaoImpl;
import com.model.Applicant;
import com.model.JobApplication;
import com.model.JobListing;

public class CompanyService {
	CompanyDao dao=new CompanyDaoImpl();

	public List<JobListing> findAll() throws SQLException {
		// TODO Auto-generated method stub
		return dao.findAll();
	}
	public int insert(JobApplication jobApplication) throws SQLException {
		// TODO Auto-generated method stub
		return dao.save(jobApplication);
	}

	public List<Applicant> findAlla() throws SQLException{
		// TODO Auto-generated method stub
		return dao.findAlla();
	}
	public int insert(JobListing jobListing)throws SQLException {
		// TODO Auto-generated method stub
		return dao.save(jobListing);
	}

}
