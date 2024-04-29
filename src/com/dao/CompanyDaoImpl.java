package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.model.Applicant;
import com.model.JobApplication;
import com.model.JobListing;
import com.utility.DBConnection;

public class CompanyDaoImpl implements CompanyDao {

	@Override
	public List<JobListing> findAll() throws SQLException {
		// TODO Auto-generated method stub
		Connection con = DBConnection.dbConnect();
		String sql="select * from job_listing";
		PreparedStatement pstmt = con.prepareStatement(sql);
		ResultSet rst = pstmt.executeQuery();
		List<JobListing> list = new ArrayList<>();
		while(rst.next() == true) {
			int id  = rst.getInt("job_id");
			int name = rst.getInt("company_id");
			String title = rst.getString("job_title");
			String description = rst.getString("job_description");
			String location = rst.getString("job_location");
			double salary = rst.getDouble("salary");
			String type = rst.getString("job_type");
			String date = rst.getString("posted_date");
			
			JobListing job = new JobListing(id,name,title,description,location,salary,type,date); //100X 200X 300X
			list.add(job);
		}
		DBConnection.dbClose();		
		return list;
	}
	@Override
	public int save(JobApplication jobApplication) throws SQLException {
		// TODO Auto-generated method stub
		Connection con = DBConnection.dbConnect();
		String sql="insert into job_application (applcation_id, job_id,applicant_id,application_date,cover_letter) values (?,?,?,?,?)";
		PreparedStatement pstmt = con.prepareStatement(sql);
		pstmt.setInt(1, jobApplication.getApplicationId());
		pstmt.setInt(2, jobApplication.getJobId());
		pstmt.setInt(3, jobApplication.getApplicantId());
		pstmt.setString(4, jobApplication.getApplicationDate());
		pstmt.setString(5, jobApplication.getCoverLetter());
		
		int status = pstmt.executeUpdate();  
		DBConnection.dbClose();
		return status;
	}


	@Override
	public List<Applicant> findAlla() throws SQLException {
		// TODO Auto-generated method stub
		Connection con = DBConnection.dbConnect();
		String sql="select * from applicant";
		PreparedStatement pstmt = con.prepareStatement(sql);
		ResultSet rst = pstmt.executeQuery();
		List<Applicant> list = new ArrayList<>();
		while(rst.next() == true) {
			int id=rst.getInt("applicant_id");
			String fName=rst.getString("first_name");
			String lName=rst.getString("last_name");
			String email=rst.getString("email");
			int phone=rst.getInt("phone");
			String resume=rst.getString("resume");
			
			Applicant applicant=new Applicant(id,fName,lName,email,phone,resume);
			list.add(applicant);
			
		}
		DBConnection.dbClose();
		return list;
	}
	@Override
	public int save(JobListing jobListing) throws SQLException {
		// TODO Auto-generated method stub
		Connection con = DBConnection.dbConnect();
		String sql="INSERT INTO job_listing (job_id,company_id,job_title,job_description,job_location,salary,job_type,posted_date) VALUES (?,?,?,?,?,?,?,?)";
		PreparedStatement pstmt = con.prepareStatement(sql);
		pstmt.setInt(1, jobListing.getJobId());
		pstmt.setInt(2, jobListing.getCompanyId());
		pstmt.setString(1, jobListing.getJobTitle());
		pstmt.setString(1, jobListing.getJobDescription());
		pstmt.setString(1, jobListing.getJobLocation());
		pstmt.setDouble(1, jobListing.getSalary());
		pstmt.setString(1, jobListing.getJobType());
		pstmt.setString(1, jobListing.getPostedDate());
			
		int status = pstmt.executeUpdate(); //1: if all good., 0 - if op fails 
		DBConnection.dbClose();
		return status;
	}

}
