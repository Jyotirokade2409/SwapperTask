package com.sts.swaggertask.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sts.swaggertask.Entity.Product;

@Repository
public interface ProductRepository extends CrudRepository<Product, Integer>
{

	

}
