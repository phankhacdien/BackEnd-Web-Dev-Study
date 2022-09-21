package com.spring_tutorial.spring_tutorial_nguyen_duc_hoang.Repositories;

import com.spring_tutorial.spring_tutorial_nguyen_duc_hoang.Entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    public List<Product> findByproductName(String productName);
}
