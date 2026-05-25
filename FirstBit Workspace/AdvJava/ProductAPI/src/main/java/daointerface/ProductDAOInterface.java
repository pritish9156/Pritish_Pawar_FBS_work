package daointerface;

import java.util.ArrayList;

import model.Product;

public interface ProductDAOInterface {
	
	ArrayList<Product> getAllProducts();
	Product getProductById(int pid);
	ArrayList<Product> getProductByName(String pname);
	boolean updateProduct(Product product);
	boolean deleteProduct(int productId);
	

}
