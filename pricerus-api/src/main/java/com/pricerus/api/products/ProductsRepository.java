package com.pricerus.api.products;

import java.util.List;

import org.springframework.data.repository.CrudRepository;



public interface ProductsRepository extends CrudRepository<Products, Integer> {
	
	public List<Products> findByUserId(Integer userID);

}
