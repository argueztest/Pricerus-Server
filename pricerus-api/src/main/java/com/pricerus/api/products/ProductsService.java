package com.pricerus.api.products;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;




@Service
public class ProductsService {
	
	@Autowired
	private ProductsRepository productsRepository;

	public void addProduct(Products product) {
		
		productsRepository.save(product);
	}

	public List<Products> getAllProducts(Integer userID) {
		List<Products> products = new ArrayList<>();
		 productsRepository.findByUserId(userID).forEach(products::add);
		 return products;
		
	}


	public List<Products> getAllProducts() {
		List<Products> products = new ArrayList<>();
		productsRepository.findAll().forEach(products::add);
		 return products;
	}

	public void deleteProduct(Integer productId) {
		productsRepository.delete(productId);
		
	}

	public void updateProduct(Products product) {
		productsRepository.save(product);
		
	}
}
