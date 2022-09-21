package com.spring_tutorial.spring_tutorial_nguyen_duc_hoang.Services.ServicesImp;

import com.spring_tutorial.spring_tutorial_nguyen_duc_hoang.Entities.Product;
import com.spring_tutorial.spring_tutorial_nguyen_duc_hoang.Entities.ResponseObject;
import com.spring_tutorial.spring_tutorial_nguyen_duc_hoang.Repositories.ProductRepository;
import com.spring_tutorial.spring_tutorial_nguyen_duc_hoang.Services.iServices.iProductsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class ProductsServiceService implements iProductsService {
    private final ProductRepository productRepository;

    @Autowired
    public ProductsServiceService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public List<Product> getAllProduct() {
        return productRepository.findAll();
    }

    @Override
    public ResponseEntity<ResponseObject> getProductByID(Long getID) {
        Optional<Product> foundProduct = productRepository.findById(getID);

        return foundProduct.isPresent() ?
                ResponseEntity.status(HttpStatus.OK).body(
                        new ResponseObject("Ok", "Query product Successfully!", foundProduct)
                ) :
                ResponseEntity.status(HttpStatus.NOT_FOUND).body(
                        new ResponseObject("Not found", "Cannot find any product with ID: " + getID, null)
                );
    }

    @Override
    public ResponseEntity<ResponseObject> insertProduct(Product new_product) {
        List<Product> foundProductList = productRepository.findByproductName(new_product.getProductName().trim());

        return foundProductList.size() > 0 ?
                ResponseEntity.status(HttpStatus.NOT_IMPLEMENTED).body(
                        new ResponseObject("Failed", "Product is presented in database!", new_product)
                ) :
                ResponseEntity.status(HttpStatus.OK).body(
                        new ResponseObject("Ok", "Product inserted", productRepository.save(new_product))
                );
    }

    @Override
    public ResponseEntity<ResponseObject> updateProduct(Product new_product, Long id) {
        Product updatedProduct = productRepository.findById(id)
                .map(product -> {
                    product.setProductName(new_product.getProductName());
                    product.setProductYear(new_product.getProductYear());
                    product.setProductPrice(new_product.getProductPrice());
                    product.setProductURL(new_product.getProductURL());
                    return productRepository.save(product);
                }).orElseGet(() -> productRepository.save(new_product));

        return ResponseEntity.status(HttpStatus.OK).body(
                new ResponseObject("Ok", "Update product Successfully!", updatedProduct)
        );
    }

    @Override
    public ResponseEntity<ResponseObject> deleteProduct(Long deleteID) {
        if (productRepository.existsById(deleteID)) {
            Product deletedProduct = productRepository.findById(deleteID).orElse(null);
            assert deletedProduct != null;
            productRepository.delete(deletedProduct);

            return ResponseEntity.status(HttpStatus.OK).body(
                    new ResponseObject("Ok", "Deleted product successfully", deletedProduct)
            );
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(
                    new ResponseObject("Failed", "Cannot found product with ID: " +deleteID, null)
            );
        }
    }
}