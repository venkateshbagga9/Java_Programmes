package com.bitlabs.AarogyaHospital;

	public interface DaoInterface {
		public void patientRegistration(Patient p);
		public void viewAllPatients();
		public void searchPatientById(int id);
		public void deletePatientById(int id);
		public void searchPatientByCity(String city);
		public void searchPatientByAgeGroup(int start,int end);
		public void markPatientRecoveryById(int id);

	}


