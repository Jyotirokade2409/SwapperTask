package com.sts.swaggertask.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.sts.swaggertask.Entity.Product;
import com.sts.swaggertask.repository.ProductRepository;



@Service
public class Prodservices 
{
	@Autowired
	private ProductRepository serviceRepo;
	public List<Product> getAllProducts()
	{
		List<Product> list=new ArrayList<Product>();
		this.serviceRepo.findAll().forEach(list::add);
		return list;
	}
	public void addProduct(Product product)
	{
		this.serviceRepo.save(product);
	}
	public void updateProduct(Integer id,Product product)
	{
		this.serviceRepo.save(product);
	}
	public void deleteProduct(Integer id)
	{
		this.serviceRepo.deleteById(id);
	}
}
