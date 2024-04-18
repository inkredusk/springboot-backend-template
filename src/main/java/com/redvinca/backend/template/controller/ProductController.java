package com.redvinca.backend.template.controller;

import java.util.List;
import javax.validation.Valid;
// Importing required classes
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.redvinca.backend.template.entity.Product;
import com.redvinca.backend.template.service.ProductService;
 
// Annotation
@RestController
 
// Class
public class ProductController {
 
    // Annotation
    @Autowired private ProductService productService;
 
    // Save operation
    @PostMapping("/products")
    public Product saveProduct(
        @Valid @RequestBody Product product) {
        return productService.saveProduct(product);
    }
 
    // Read operation
    @GetMapping("/products")
    public List<Product> fetchProductList()
    {
        return productService.fetchProductList();
    }
 
    // Update operation
    @PutMapping("/products/{id}")
    public Product
    updateProduct(@RequestBody Product product,
                     @PathVariable("id") Long productId)
    {
        return productService.updateProduct(
            product, productId);
    }
 
    // Delete operation
    @DeleteMapping("/products/{id}")
    public String deleteProductById(@PathVariable("id")
                                       Long productId)
    {
        productService.deleteProductById(
            productId);
        return "Deleted Successfully";
    }
}