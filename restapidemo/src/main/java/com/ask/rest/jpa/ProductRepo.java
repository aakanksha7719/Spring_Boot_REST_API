package com.ask.rest.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ask.rest.entity.Product;

public interface ProductRepo extends JpaRepository<Product, Integer> {

}
