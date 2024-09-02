package com.google.vooteridapplication.runner;
import com.google.vooteridapplication.things.Employee;
public class EmployeeRunner {

	public static void main(String[] args) {
		
			  
		Employee employee = new Employee();
		employee.setname("muskan");
			   if(employee.getname()=="muskan" && employee.getname()=="muskan"){
			   System.out.println("name:"+employee.getname());
			   System.out.println("name is matching");
			   }else{
			   System.out.println("mis match");
			   }
			    //System.out.println("name:"+employee.getname());
				
			   employee.setId(123543);
			   System.out.println("id:"+employee.getId());
			   
			   employee.setsalary(10000);
			   if(employee.getsalary()>25000 && employee.getsalary()<50000){
			   System.out.println("employee:"+employee.getsalary());
			   System.out.println("employee details are matching");
			   }else{
			   System.out.println("mis match");
			   }
			   
			   
			  }

			

	}


