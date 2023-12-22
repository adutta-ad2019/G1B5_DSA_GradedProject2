package App;

import Model.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AdminDepartment admin=new AdminDepartment();
		System.out.println(admin.departmentName());
		System.out.println(admin.getTodaysWork());
		System.out.println(admin.getWorkDeadline());
		System.out.println(admin.isTodayAHoliday() +"\n");
		HrDepartment hr=new HrDepartment();
		System.out.println(hr.departmentName());
		System.out.println(hr.doActivity());
		System.out.println(hr.getTodaysWork());
		System.out.println(hr.getWorkDeadline());
		System.out.println(hr.isTodayAHoliday()+"\n");
		TechDepartment tech=new TechDepartment();
		System.out.println(tech.departmentName());
		System.out.println(tech.getTodaysWork());
		System.out.println(tech.getWorkDeadline());
		System.out.println(tech.getTechStackInformation());
		System.out.println(tech.isTodayAHoliday()+"\n");
	}

}
