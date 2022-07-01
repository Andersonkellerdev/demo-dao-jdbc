package application;

import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		
		Department department = departmentDao.findById(2);
		
		System.out.println("\n=== TEST 1 : department findByID ==== ");
		
		System.out.println("\n=== TEST 2: department insert ==== ");
		Department newDepartment = new Department(null, "Music");
		departmentDao.insert(newDepartment);
		System.out.println("Inserted! New id = "+ newDepartment.getId());
		
		System.out.println("\n=== TEST 3: department update ==== ");
		department = departmentDao.findById(4);
		department.setName("Apple");
		departmentDao.update(department);
		System.out.println("Update completed");
		
		System.out.println("\n=== TEST 4: department delete ==== ");
		System.out.println("Enter id for delete test: ");
		int id = sc.nextInt();
		departmentDao.deleteById(id);
		System.out.println("Delete completed");
		
		sc.close();

	}

}
