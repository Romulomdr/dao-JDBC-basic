package application;

import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		Seller seller = sellerDao.findById(3);
		System.out.println("== TEST 1 FIND BY ID 3: \n"+ seller);
		
		System.out.println("\n == TEST 2 FIND BY DEPARTMENT 2:");
		Department department = new Department(4,null);
		List<Seller> list = sellerDao.findByDepartment(department);
		for(Seller obj : list) {
			System.out.println(obj);
		}
		
		System.out.println("\n == TEST 3 FIND ALL:");
		list = sellerDao.findAll();
		for(Seller obj : list) {
			System.out.println(obj);
		}
//		System.out.println("\n == TEST 4 INSERT:");
//		Seller seller1 = new Seller(null, "Greg", "greg@gmail.com", new Date(), 4000.0, department);
//		sellerDao.insert(seller1);
//		System.out.println("Inserted new Id = "+ seller.getId());
		
		System.out.println("\n == TEST 5 UPDATE:");
		seller = sellerDao.findById(1);
		seller.setName("Marta Waine");
		sellerDao.update(seller);
		System.out.println("Update Completed");
		
		System.out.println("\n == TEST 6 Delete seller:");
		System.out.println("Enter Id for delete test: ");
		int id = sc.nextInt();
		sellerDao.deleteById(id);
		System.out.println("Seller: "+ id +" Deleted");
	}
}