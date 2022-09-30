package com.sts.swaggertask.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sts.swaggertask.Entity.Product;
import com.sts.swaggertask.services.Prodservices;


@RestController
public class MyController 
{
	@Autowired
	private Prodservices service;

	@GetMapping("/products")
	public List<Product> getAllProducts() 
	{
		return service.getAllProducts();
	}
	
	//@RequestMapping(method = RequestMethod.PUT,value="/customer")
	
	@PostMapping("/addProduct")
	public void addProduct(@RequestBody Product product )
	{
		this.service.addProduct(product);
		
	}

	@PutMapping("/product/{prodid}")
	public Product updateProduct(@PathVariable String prodid,@RequestBody Product product) 
	{
		service.updateProduct(Integer.parseInt(prodid),product);
		return null;
	}
	
	@GetMapping("/deleteproduct/{prodid}")
	public Product deleteProduct(@PathVariable String prodid)
	{
	   service.deleteProduct(Integer.parseInt(prodid));
	   return null;
	}
}
