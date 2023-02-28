package application;

import java.util.Date;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
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
		System.out.println("\n == TEST 4 INSERT:");
		Seller seller1 = new Seller(null, "Greg", "greg@gmail.com", new Date(), 4000.0, department);
		sellerDao.insert(seller1);
		System.out.println("Inserted new Id = "+ seller.getId());
	}
}