package com.controller;

import java.sql.SQLException;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import com.model.Applicant;
import com.model.JobApplication;
import com.model.JobListing;
import com.service.CompanyService;

public class CompanyController {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CompanyService companyService = new CompanyService();
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("-------------- WELCOME -------------");
			System.out.println("\n--------------Company -------------");
			System.out.println("Press 1. Post Jobs ");
			System.out.println("Press 2. View All Jobs ");
			System.out.println("-------------- Job Listing -------------");
			System.out.println("Press 3. Apply for Job ");
			System.out.println("Press 4. View All Applicants");
			
			System.out.println("Press 0. to Exit");
			int input = sc.nextInt();
			if(input == 0) {
				System.out.println("Exiting Artist Module..");
				break; 
			}
		switch(input) {
		case 1:
			Random random=new Random();
			int randomNumber= random.nextInt();
			int jobid =randomNumber<0?randomNumber*-1:randomNumber;
			
			Random randomc=new Random();
			int randomNumberc= randomc.nextInt();
			int companyid =randomNumberc<0?randomNumberc*-1:randomNumberc;
			
			System.out.println("Enter Job Title");
			sc.nextLine();
			String title=sc.nextLine();
			
			System.out.println("Enter Job Description");
			String description=sc.nextLine();
			System.out.println("Enter Job location");
			String location=sc.nextLine();
			
			System.out.println("Enter salary");
			double salary=sc.nextDouble();
			
			System.out.println("Enter Job type");
			String type=sc.nextLine();
			System.out.println("Enter posted date");
			String date=sc.nextLine();
			
			JobListing jobListing= new JobListing(jobid,companyid,location,salary,type,date);
			
			try {
				int status=companyService.insert(jobListing);
				if (status==1)
					System.out.println("Applied Successfully");
				else
					System.out.println("Insertion failed");
						
			}catch(SQLException e) {
				System.out.println(e.getMessage());
			}
			
			
		break;
		
		
//2
		case 2:
			try {
				List<JobListing> list = companyService.findAll();
				for(JobListing a : list) {
					System.out.println(a);
				}
			} catch (SQLException e) {
				System.out.println(e.getMessage());
			}
		break;
//3
		case 3:
			Random randomapp=new Random();
			int randomNumberapp= randomapp.nextInt();
			int apcatid =randomNumberapp<0?randomNumberapp*-1:randomNumberapp;
			
			Random randomjob=new Random();
			int randomNumberjob= randomjob.nextInt();
			int jid =randomNumberjob<0?randomNumberjob*-1:randomNumberjob;
			
			System.out.println("Enter applicant Id");
			int apcntid=sc.nextInt();
			
			System.out.println("Enter Application Date");
			sc.nextLine();
			String adate=sc.nextLine();
			
			System.out.println("Enter Cover Letter URL");
			String coverL=sc.nextLine();
			
			JobApplication jobApplication= new JobApplication(apcatid,jid,apcntid,adate,coverL);
			
			try {
				int status=companyService.insert(jobApplication);
				if (status==1)
					System.out.println("Applied Successfully");
				else
					System.out.println("Insertion failed");
						
			}catch(SQLException e) {
				System.out.println(e.getMessage());
			}
			
		break;
//4
		case 4:
			try {
				List<Applicant> list=companyService.findAlla();
				for(Applicant a : list) {
					System.out.println(a);
				}
			}catch (SQLException e) {
				System.out.println(e.getMessage());
			}
		break;
		}
		}
		sc.close();
	}
		

}

