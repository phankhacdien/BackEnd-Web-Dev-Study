package com.spring_tutorial.spring_tutorial_nguyen_duc_hoang.Controllers;

import com.spring_tutorial.spring_tutorial_nguyen_duc_hoang.Entities.Product;
import com.spring_tutorial.spring_tutorial_nguyen_duc_hoang.Entities.ResponseObject;
import com.spring_tutorial.spring_tutorial_nguyen_duc_hoang.Services.iServices.iProductsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api/v1/Products")
public class ProductController {
    private final iProductsService productsService;

    @Autowired
    public ProductController(iProductsService productsService) {
        this.productsService = productsService;
    }

    @GetMapping("")
    List<Product> getAllProducts() {
        return productsService.getAllProduct();
    }

    @GetMapping("/{getID}")
    ResponseEntity<ResponseObject> getProductByID(@PathVariable Long getID) {
        return productsService.getProductByID(getID);
    }

    @PostMapping("/insert")
    ResponseEntity<ResponseObject> insertProduct(@RequestBody Product new_product) {
        return productsService.insertProduct(new_product);
    }

    @PutMapping("/update/{id}")
    ResponseEntity<ResponseObject> updateProduct(@RequestBody Product new_product,@PathVariable Long id) {
        return  productsService.updateProduct(new_product, id);
    }

    @DeleteMapping("/delete/{deleteID}")
    ResponseEntity<ResponseObject> deleteProduct(@PathVariable Long deleteID) {
        return productsService.deleteProduct(deleteID);
    }
}
