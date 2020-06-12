package com.nttdata.EmployeeTest;

import java.util.ArrayList;
import java.util.List;

import org.mockito.Mockito;

import com.nttdata.DAO.EmployeeDAO;
import com.nttdata.Model.Employee;

class EmployeeTestUsingMock {

	EmployeeDAO Employeedao=Mockito.mock(EmployeeDAO.class);
	public void testgetByEmployeeId() {
		List<Employee> Employeelist=new ArrayList<Employee>();
		Employeelist.add(new Employee(1, "AAA","Bangalore", 230000));
		Employeelist.add(new Employee(2, "BBB","Chennai", 55700));
		Employeelist.add(new Employee(3, "CCC","Hosur", 23455));
		Employeelist.add(new Employee(4, "DDD","Hyderabad", 75400));
		Employeelist.add(new Employee(5, "EEE","Mumbai", 45000));
		int id=3;
		Employee e = null;
		for(int i=0;i<Employeelist.size();i++)
		{
			if(Employeelist.get(i).getEmployeeId()==id)
			{
				e=new Employee(Employeelist.get(i).getEmployeeId(), Employeelist.get(i).getEmployeeName(), Employeelist.get(i).getEmployeeAddress(), Employeelist.get(i).getEmployeeSalary());
			
			}
		}
		Mockito.when(EmployeeDAO.getByEmployeeId(id)).thenReturn(e);
	}
	@SuppressWarnings("null")
	public void testcreateEmployee()
	{
		@SuppressWarnings("unused")
		List<Employee> Employeelist=new ArrayList<Employee>();
		Employee e=null;
		e.setEmployeeId(3);
		e.setEmployeeName("CCC");
		e.setEmployeeAddress("Bangalore");
		e.setEmployeeSalary(23000);
		Mockito.when(EmployeeDAO.createEmployee()).thenReturn(e);
		
	}
	public void deleteEmployee()
	{
		List<Employee> Employeelist=new ArrayList<Employee>();
		Employeelist.add(new Employee(1, "AAA","Bangalore", 230000));
		Employeelist.add(new Employee(2, "BBB","Chennai", 55700));
		Employeelist.add(new Employee(3, "CCC","Hosur", 23455));
		Employeelist.add(new Employee(4, "DDD","Hyderabad", 75400));
		Employeelist.add(new Employee(5, "EEE","Mumbai", 45000));
		int id=3;
		Employee e = null;
		for(int i=0;i<Employeelist.size();i++)
		{
			if(Employeelist.get(i).getEmployeeId()==id)
			{
				e=new Employee(Employeelist.get(i).getEmployeeId(), Employeelist.get(i).getEmployeeName(), Employeelist.get(i).getEmployeeAddress(), Employeelist.get(i).getEmployeeSalary());
				Employeelist.remove(i);
			}
		}
		Mockito.when(EmployeeDAO.deleteEmployee(id)).thenReturn(e);
	}
	public void testListEmployee()
	{
		List<Employee> Employeelist=new ArrayList<Employee>();
		Employeelist.add(new Employee(1, "AAA","Bangalore", 230000));
		Employeelist.add(new Employee(2, "BBB","Chennai", 55700));
		Employeelist.add(new Employee(3, "CCC","Hosur", 23455));
		Mockito.when(EmployeeDAO.listEmployee()).thenReturn(Employeelist);
	}
	public void searchEmployeeByName()
	{
		List<Employee> Employeelist=new ArrayList<Employee>();
		Employeelist.add(new Employee(1, "AAA","Bangalore", 230000));
		Employeelist.add(new Employee(2, "BBB","Chennai", 55700));
		Employeelist.add(new Employee(3, "CCC","Hosur", 23455));
		Employeelist.add(new Employee(4, "DDD","Hyderabad", 75400));
		Employeelist.add(new Employee(5, "EEE","Mumbai", 45000));
		String name="CCC";
		Employee e = null;
		for(int i=0;i<Employeelist.size();i++)
		{
			if(Employeelist.get(i).getEmployeeName().equalsIgnoreCase(name));
			{
				e=new Employee(Employeelist.get(i).getEmployeeId(), Employeelist.get(i).getEmployeeName(), Employeelist.get(i).getEmployeeAddress(), Employeelist.get(i).getEmployeeSalary());
			}
		}
		Mockito.when(EmployeeDAO.searchEmployeeByName(name)).thenReturn(e);
	}

}
