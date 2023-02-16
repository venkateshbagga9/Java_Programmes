package com.bitlabs.AarogyaHospital;

public class Patient {
private String name,gender,city,address,date_of_admission,guardian_name,guardian_address;
private String recovery="notrecoverd";
private int age,id;
private long aadhar_no,contact_no,guardian_phno;
static int count=0;
public Patient()
{
	count++;
	id=count;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getDate_of_admission() {
	return date_of_admission;
}
public void setDate_of_admission(String date_of_admission) {
	this.date_of_admission = date_of_admission;
}
public String getGuardian_name() {
	return guardian_name;
}
public void setGuardian_name(String guardian_name) {
	this.guardian_name = guardian_name;
}
public String getGuardian_address() {
	return guardian_address;
}
public void setGuardian_address(String guardian_address) {
	this.guardian_address = guardian_address;
}
public String getRecovery() {
	return recovery;
}
public void setRecovery(String recovery) {
	this.recovery = recovery;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public long getAadhar_no() {
	return aadhar_no;
}
public void setAadhar_no(long aadhar_no) {
	this.aadhar_no = aadhar_no;
}
public long getContact_no() {
	return contact_no;
}
public void setContact_no(long contact_no) {
	this.contact_no = contact_no;
}
public long getGuardian_phno() {
	return guardian_phno;
}
public void setGuardian_phno(long guardian_phno) {
	this.guardian_phno = guardian_phno;

}

}
