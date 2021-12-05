package com.oopslearnings.com;

public class AdminDepartment extends SuperDepartment {
	    public String departmentName() {
	    	String Admin = "Admin";
		System.out.println("Welcome to Admin Department");
		return  Admin;
		}
		String getTodayWork () {
			String Sub = "Sub";
			System.out.println("Complete your Documents Submission");
			return Sub;
			}
		String getWorkDeadline () {
            String Aeod = "Aeod";
			System.out.println("Complete by EOD ");
			return Aeod;
		}
}


  