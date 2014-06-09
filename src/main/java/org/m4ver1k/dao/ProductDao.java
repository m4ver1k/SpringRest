package org.m4ver1k.dao;

/* NOTE:
 * Ideally you should have a Interface for your DAO and specific implementaion for 
 * each DAO Provider eg: JPA,Hibernate,JDBC etc.
 * Here we do some basic CRUD operation on H2 with JDBCTemplates.*/
import java.util.List;

import javax.sql.DataSource;

import org.m4ver1k.beans.Product;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * @author Maver1k
 * 
 */
@Repository
public class ProductDao {
	
	private JdbcTemplate jdbcTemplate;
	
	public void setDataSource(DataSource dataSource){
		this.jdbcTemplate=new JdbcTemplate(dataSource);
	}
	public Product getProductById(int id){
		return null;
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
