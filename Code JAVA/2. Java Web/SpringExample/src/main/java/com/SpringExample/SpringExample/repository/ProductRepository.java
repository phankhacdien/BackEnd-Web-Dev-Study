package com.SpringExample.SpringExample.repository;

import com.SpringExample.SpringExample.Entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
