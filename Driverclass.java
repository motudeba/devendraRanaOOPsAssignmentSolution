package com.oopslearnings.com;

public class Driverclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AdminDepartment admin = new AdminDepartment();
	    admin.departmentName();
		admin.getTodayWork();
		admin.getWorkDeadline();
		admin.isTodayAHoliday();
		
		HrDepartment hr = new HrDepartment();
		hr.departmentName1();
		hr.doActivity();
		hr.getTodayWork1();
		hr.getWorkDeadline();
		hr.isTodayAHoliday();
		
		TechDepartment tech = new TechDepartment();
		tech.departmentName();
		tech.getTodayWork();
		tech.getWorkDeadline();
		tech.getStackInformation();
		tech.isTodayAHoliday();
		}
}
