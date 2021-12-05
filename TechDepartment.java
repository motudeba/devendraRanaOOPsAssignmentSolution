package com.oopslearnings.com;

public class TechDepartment extends SuperDepartment {
	 public String departmentName() {
	    	String Tech = "Tech";
		System.out.println("Welcome to the Tech Department");
		return  Tech;
		}
		String getTodayWork () {
			String Sub = "Sub";
			System.out.println("Complete coding of module 1");
			return Sub;
			}
		String getWorkDeadline () {
         String Aeod = "Aeod";
			System.out.println("Complete by EOD ");
			return Aeod;
		}
		String getStackInformation () {
	         String Stack = "Stack";
				System.out.println("Core Java ");
				return Stack;
		}
}