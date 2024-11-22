package com.learn.spring_boot_crud_example.repository;


import com.learn.spring_boot_crud_example.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {
    Product findByName(String name);
}

