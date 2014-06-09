package org.m4ver1k.service;

import java.util.List;

import org.m4ver1k.beans.Product;
import org.m4ver1k.dao.ProductDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

	@Autowired
	private ProductDao productDao;
	
	public Product getProductById(int id){
		return productDao.getProductById(id);
	}
	
	public List<Product> getAllProducts(){
		return null;
	}
	
	public List<Product> getProductByCategory(String category){
		 return null;
	}
	public void createProduct(Product product){
		
	}
	public void deleteProductById(int id){
		
	}
}
