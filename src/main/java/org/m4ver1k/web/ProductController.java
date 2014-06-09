package org.m4ver1k.web;

import org.m4ver1k.beans.Product;
import org.m4ver1k.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value="/api/v1/product")
public class ProductController {

	@Autowired
	private ProductService service;  
	
	@RequestMapping(value="/{id}",method=RequestMethod.GET)
	public Product getProductById(@PathVariable("id") int id ){
		return service.getProductById(id);
	}
}
