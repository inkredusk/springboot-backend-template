package com.redvinca.backend.template.service;

import java.util.List;

import com.redvinca.backend.template.entity.Product;

public interface ProductService {
 
    /**
     * This function is used to save a new Product in database.
     * It will return the saved product.
     * 
     * @param product the Product entity to be saved
     * @return the saved Product entity
     */
    Product saveProduct(Product product);
 
    // Read operation
    List<Product> fetchProductList();
 
    // Update operation
    Product updateProduct(Product product,
                                Long productId);
 
    // Delete operation
    void deleteProductById(Long productId);
}