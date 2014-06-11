package org.m4ver1k.web;

import java.util.List;
import java.util.Map;

import org.m4ver1k.beans.Product;
import org.m4ver1k.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value="/api/v1/product")
public class ProductController {

	@Autowired
	private ProductService service;  
	
	@RequestMapping(value="/{id}",method=RequestMethod.GET,produces="application/json")
	public @ResponseBody Product getProductById(@PathVariable("id") int id ){
		return service.getProductById(id);
	}
	
	@RequestMapping(value="/")
	public @ResponseBody List<Map<String, Object>> getAllProduct(){
		return service.getAllProducts();
	}
	
	@RequestMapping(value="/category/{cname}")
	public @ResponseBody List<Map<String, Object>> getProductByCategoryName(@PathVariable("cname") String category){
		return service.getProductByCategory(category);
	}
}
