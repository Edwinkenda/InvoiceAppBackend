package com.example.rbcdemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.rbcdemo.model.Product;
import com.example.rbcdemo.repo.ProductRepo;

@Repository
public class ProductService {
	
	private final ProductRepo productRepo;
	
	@Autowired
	public ProductService(ProductRepo productRepo) {
		this.productRepo = productRepo;
		
	}
	
	public List<Product> findAllProducts() {
		return productRepo.findAll();
		}

}
