package com.bitlabs.AarogyaHospital;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DaoImpl {
Connection con=null;
public DaoImpl() throws Exception
{
	try {
	//register the driver class
	Class.forName("com.mysql.jdbc.Driver");
	
	//get the connection
	con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital","root","root");
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
}
	public void patientRegistration(Patient p) throws Exception
	{
		try {
		PreparedStatement pstmt=con.prepareStatement("insert into patient values(?,?,?,?,?,?,?,?,?,?,?,?,?)");
		pstmt.setInt(1,p.getId());
		pstmt.setString(2,p.getName());
		pstmt.setInt(3,p.getAge());
		pstmt.setString(4,p.getGender());
		pstmt.setString(5,p.getCity());		
		pstmt.setString(6,p.getAddress());
		pstmt.setString(7,p.getDate_of_admission());
		pstmt.setLong(8,p.getContact_no());
		pstmt.setLong(9,p.getAadhar_no());
		pstmt.setString(10,p.getGuardian_name());
		pstmt.setLong(11, p.getGuardian_phno());
		pstmt.setString(12,p.getGuardian_address());
		pstmt.setString(13,p.getRecovery());
		int i=pstmt.executeUpdate();
		if(i>0)
		{
			System.out.println("data inserted successfully");
		}
		else
		{
			System.out.println("please try again");
		}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
//	Display all patient
	public void viewAllPatient() {
		try {
		Statement st=con.createStatement();
		ResultSet rs;
			rs = st.executeQuery("select*from patient");
			while(rs.next()) {
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getString(4)+" "+rs.getString(5)+" "+rs.getString(6)+" "+rs.getString(7)+" "+rs.getLong(8)+" "+rs.getLong(9)+" "+rs.getString(10)+" "+rs.getLong(11)+" "+rs.getString(12)+" "+rs.getString(13));
			}
		} 
		catch (Exception e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

//		search patient by id 
		public void searchPatientById(int id) {
			try {
			Statement st=con.createStatement();
			ResultSet rs;
			
				rs = st.executeQuery("select*from patient where id='"+id+"'");
				while(rs.next()) {
					System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getString(4)+" "+rs.getLong(5)+" "+rs.getLong(6)+" "+rs.getString(7)+" "+rs.getString(8)+" "+rs.getString(9)+" "+rs.getString(10)+" "+rs.getString(11)+" "+rs.getLong(12)+" "+rs.getString(13));
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
//		delete a patient by id
		public void deletePatientById(int id) {
			try {
				Statement st=con.createStatement();
				int i=st.executeUpdate("delete from patient where id='"+id+"'");
				if(i>0) {
					System.out.println("patient data deleted sucessfully");
				}
				else {
					System.out.println("Not deleted please try again");
				}
			}
			catch(Exception e) {
				System.out.println(e);
			}
		}
		
//		search a patient based by city
		public void searchPatientByCity(String city) {
			try {
				Statement st=con.createStatement();
				ResultSet rs= st.executeQuery("select* from patient where city= '"+city+"'");
				while(rs.next()) {
					System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getString(4)+" "+rs.getString(5)+" "+rs.getString(6)+" "+rs.getString(7)+" "+rs.getLong(8)+" "+rs.getLong(9)+" "+rs.getString(10)+" "+rs.getLong(11)+" "+rs.getString(12)+" "+rs.getString(13));
				}
			}
			catch(Exception e) {
				System.out.println(e);
			}
		}
		
//		search a patient by age group 
		public void searchPatientByAgeGroup(int start,int end) {
			try {
				Statement st=con.createStatement();
				ResultSet rs= st.executeQuery("select*from patient where age between '"+start+"' and '"+end+"' ");
				while(rs.next()) {
					System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getString(4)+" "+rs.getString(5)+" "+rs.getString(6)+" "+rs.getString(7)+" "+rs.getLong(8)+" "+rs.getLong(9)+" "+rs.getString(10)+" "+rs.getLong(11)+" "+rs.getString(12)+" "+rs.getString(13));
				}
			}
			catch(Exception e) {
				System.out.println(e);
			}
		}
		
//		recovery status of patient based on id
		public void markPatientRecoveryById(int id) {
			try {
				Statement st= con.createStatement();
				int i= st.executeUpdate("update patient set recover='"+"Recoverd"+"' where id= '"+id+"'");
				if(i>0) {
					System.out.println("patient has been recoverd successfully");
				}
				else {
					System.out.println("Recover status not change");
				}
			}
				catch(Exception e) {
					System.out.println(e);
				}
		
	}
	
	}

	
