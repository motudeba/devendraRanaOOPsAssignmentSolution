package com.oopslearnings.com;

public class HrDepartment extends SuperDepartment {

	 public String departmentName1() {
	    	String Hr = "Hr";
		System.out.println("Welcome to HR Department");
		return  Hr;
		}
		String getTodayWork1 () {
			String Bsub = "Bsub";
			System.out.println("Fill today’s timesheet and mark your attendance");
			return Bsub;
			}
	             String doActivity () {
		         String Lunch = "Lunch";
					System.out.println("Team Lunch");
					return Lunch;
	             }
					String getWorkDeadline () {
			            String Aeod = "Aeod";
						System.out.println("Complete by EOD ");
						return Aeod;
		}
}
