package com.spring_tutorial.spring_tutorial_nguyen_duc_hoang.Services.iServices;

import com.spring_tutorial.spring_tutorial_nguyen_duc_hoang.Entities.Product;
import com.spring_tutorial.spring_tutorial_nguyen_duc_hoang.Entities.ResponseObject;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

public interface iProductsService {
    List<Product> getAllProduct();
    ResponseEntity<ResponseObject> getProductByID(Long getID);
    ResponseEntity<ResponseObject> insertProduct(Product new_product);
    ResponseEntity<ResponseObject> updateProduct(Product new_product, Long id);
    ResponseEntity<ResponseObject> deleteProduct(Long deleteID);
}
