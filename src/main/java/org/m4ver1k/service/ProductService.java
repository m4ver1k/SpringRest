package org.m4ver1k.service;

import java.util.List;
import java.util.Map;

import org.m4ver1k.beans.Product;
import org.m4ver1k.dao.ProductDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Maver1k
 *
 */
@Service
public class ProductService {

	@Autowired
	private ProductDao productDao;
	
	public Product getProductById(int id){
		return productDao.getProductById(id);
	}
	
	public List<Map<String, Object>>getAllProducts(){
		return productDao.getAllProducts();
	}
	
	public  List<Map<String, Object>> getProductByCategory(String category){
		 return productDao.getProductByCategory(category);
	}
	public void createProduct(Product product){
		productDao.createProduct(product);
	}
	public void deleteProductById(int id){
		productDao.deleteProductById(id);
	}
}
