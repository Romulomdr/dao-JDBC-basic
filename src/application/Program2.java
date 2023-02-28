package application;

import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		Department dep = new Department();
		
		System.out.println("== TEST 1 FIND BY ID: ");
		dep = departmentDao.findById(2);
		System.out.println(dep);
		
		System.out.println("== TEST 2 FIND ALL: ");
		List<Department> departments = departmentDao.findAll();
		System.out.println(departments);
		
//		System.out.println("== TEST 3 insert");
//		Department departmentnew = new Department(null, "Music");
//		departmentDao.insert(departmentnew);
//		
		System.out.println("== TEST 3 Delete By id");
		System.out.println("Enter Id for delete: ");
		int id = sc.nextInt();
		departmentDao.deleteById(id);
		System.out.println("Delete Completed");
	}
}
