package com.example.rbcdemo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.rbcdemo.model.Product;

public interface ProductRepo extends JpaRepository<Product, Long> {

}
