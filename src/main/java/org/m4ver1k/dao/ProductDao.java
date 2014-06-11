package org.m4ver1k.dao;

/* NOTE:
 * Ideally you should have a Interface for your DAO and specific implementaion for 
 * each DAO Provider eg: JPA,Hibernate,JDBC etc.
 * Here we do some basic CRUD operation on H2 with JDBCTemplates.*/
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.m4ver1k.beans.Product;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

/**
 * @author Maver1k
 * 
 */
@Repository
public class ProductDao {
	
	private JdbcTemplate jdbcTemplate;
	private RowMapper<Product> productMapper = new RowMapper<Product>() {
		
		public Product mapRow(ResultSet rs, int rowNum) throws SQLException {
			Product ret = new Product();
			ret.setProductId(rs.getInt(1));
			ret.setName(rs.getString(2));
			ret.setDesc(rs.getString(3));
			ret.setCategory(rs.getString(4));
			ret.setPrice(rs.getLong(5));
			return ret;
		}
	};
	public void setDataSource(DataSource dataSource){
		this.jdbcTemplate=new JdbcTemplate(dataSource);
	}
	public Product getProductById(int id){
		return jdbcTemplate.queryForObject("select * from product where productId=?", new Object[]{id},productMapper);
	}
	
	public List<Map<String, Object>> getAllProducts(){
		return jdbcTemplate.queryForList("select * from product");
	}
	
	public List<Map<String, Object>> getProductByCategory(String category){
		return jdbcTemplate.queryForList("select * from product where category like '"+category+"'");
	}
	public void createProduct(Product product){
		
	}
	public void deleteProductById(int id){
		
	}
}
