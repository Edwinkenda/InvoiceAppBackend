package com.example.rbcdemo;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.example.rbcdemo.model.Product;
import com.example.rbcdemo.service.ProductService;

@EnableWebMvc
@RestController
@RequestMapping("/products")
public class ProductController {
	
	private final ProductService productService;
	
	public ProductController(ProductService productService) {
		this.productService = productService;
		
	}
	
	@GetMapping("/all")
	public ResponseEntity<List<Product>> getAllProducts(){
		List<Product> products = productService.findAllProducts();
		return new ResponseEntity<> (products, HttpStatus.OK);
	}

}
