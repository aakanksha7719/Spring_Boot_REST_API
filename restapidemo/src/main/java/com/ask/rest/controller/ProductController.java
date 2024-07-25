package com.ask.rest.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ask.rest.entity.Product;
import com.ask.rest.jpa.ProductRepo;

@RestController
public class ProductController {

	@Autowired
	ProductRepo pr;
	
	@RequestMapping(value="/products/", method=RequestMethod.GET)
	public List<Product> getProducts() {
		return pr.findAll();
	}
	
	
	@RequestMapping(value="/products/{id}", method=RequestMethod.GET)
	public Optional<Product> findProduct(@PathVariable("id") int id) {
		return pr.findById(id);
	}
	
	@RequestMapping(value="/products/", method=RequestMethod.POST)
	public Product saveProduct(@RequestBody Product p) {
		return pr.save(p);
	}
	
	@RequestMapping(value="/products/", method=RequestMethod.PUT)
	public Product updateProduct(@RequestBody Product p) {
		return pr.save(p);
	}
	
	@RequestMapping(value="/products/{id}", method=RequestMethod.DELETE)
	public void deleteProduct(@PathVariable("id") int id) {
		 pr.deleteById(id);
	}
	
}
