package com.greatlearning.departmentdetails.driver;

import com.greatlearning.departmentdetails.model.AdminDepartment;
import com.greatlearning.departmentdetails.model.HrDepartment;
import com.greatlearning.departmentdetails.model.TechDepartment;

public class Main {
		public static void main(String[] args) {
		    AdminDepartment adminDepartment = new AdminDepartment();
			HrDepartment hrDepartment = new HrDepartment();
			TechDepartment techDepartment = new TechDepartment();
			
//			Admin Department Details
			System.out.println("Welcome to "+adminDepartment.departmentName());
			System.out.println(adminDepartment.getTodaysWork());
			System.out.println(adminDepartment.getWorkDeadline());
			System.out.println(adminDepartment.isTodayAHoliday() + "\n");
			
//			HR Department Details
			System.out.println("Welcome to "+hrDepartment.departmentName());
			System.out.println(hrDepartment.doActivity());
			System.out.println(hrDepartment.getTodaysWork());
			System.out.println(hrDepartment.getWorkDeadline());
			System.out.println(hrDepartment.isTodayAHoliday() + "\n");
			
//			Tech Department Details
			System.out.println("Welcome to "+techDepartment.departmentName());
			System.out.println(techDepartment.getTodaysWork());
			System.out.println(techDepartment.getWorkDeadline());
			System.out.println(techDepartment.getTechStackInformation());
			System.out.println(techDepartment.isTodayAHoliday() + "\n");
		}
}
