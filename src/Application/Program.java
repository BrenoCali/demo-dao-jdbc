package Application;

import java.util.Date;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Seller;

public class Program {
	
	public static Date date = new Date(); 
	
	public static void main(String[] args) {
		
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		System.out.println("===TESTE 1: seller findById ===");
		Seller seller = sellerDao.findById(3);
		
		System.out.println(seller);
	
	}

}
 