package application;

import java.util.Date;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		Department obj = new Department(1, "Books");
		System.out.println(obj);

		Seller seller1 = new Seller(1,"Jorge","nome@gmail.com",new Date(),3000.0,obj);
		
		System.out.println(seller1);
		
		SellerDao sellerdao = DaoFactory.createSellerDao();
	}

}