package dao;

import java.util.List;

import entity.Department;

//2. Poji - plain old java interface

public interface DepartmentDAO 
{
	//CRUD
	void createDepartment(Department deptObj);
	Department readDepartment(int deptNumber);
	List<Department> readDepartments();
	void updateDepartment(Department deptObj);
	void deleteDepartment(int deptNumber);
}