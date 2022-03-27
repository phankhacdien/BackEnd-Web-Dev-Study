package com.SpringExample.SpringExample.Controller;

import com.SpringExample.SpringExample.Entity.Product;
import com.SpringExample.SpringExample.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/api/v1/Products")
public class ProductController {
    //DI = Dependency Injection
    //Autowired key word tự động tạo đối tượng ngay khi app được tạo, và chỉ tạo 1 lần, lần sau cứ thế mà lấy ra dùng thôi.
    @Autowired
    private ProductRepository repository;

    @GetMapping("")
    // This request is: http://localhost:8080/api/v1/Products
    List<Product> getAllProducts() {
        return repository.findAll(); //where is data?
    }

    //Get Detail product
    @GetMapping("/{id}")
    Optional<Product> findById(@PathVariable Long id) {
        return repository.findById(id);
    }
}
