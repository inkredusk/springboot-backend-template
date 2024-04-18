package com.redvinca.backend.template.service;

import java.util.List;

import com.redvinca.backend.template.entity.Product;

public interface ProductService {
 
    // Save operation
    Product saveProduct(Product product);
 
    // Read operation
    List<Product> fetchProductList();
 
    // Update operation
    Product updateProduct(Product product,
                                Long productId);
 
    // Delete operation
    void deleteProductById(Long productId);
}