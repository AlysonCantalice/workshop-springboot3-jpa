package com.alysonca.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alysonca.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
