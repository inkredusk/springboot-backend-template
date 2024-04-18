package com.redvinca.backend.template.service;

// Importing required classes
import java.util.List;
import java.util.Objects;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
 
// Annotation
@Service
 
// Class
public class ProductServiceImpl
    implements ProductService {
 
    @Autowired
    private ProductRepository productRepository;
 
    // Save operation
    @Override
    public Product saveProduct(Product product)
    {
        return productRepository.save(product);
    }
 
    // Read operation
    @Override public List<Product> fetchProductList()
    {
        return (List<Product>)
            productRepository.findAll();
    }
 
    // Update operation
    @Override
    public Product
    updateProduct(Product product,
                     Long productId)
    {
        Product productDB
            = productRepository.findById(productId)
                  .get();
 
        if (Objects.nonNull(product.getProductName())
            && !"".equalsIgnoreCase(
                product.getProductName())) {
            productDB.setProductName(
                product.getProductName());
        }
 
        if (Objects.nonNull(
                product.getProductAddress())
            && !"".equalsIgnoreCase(
                product.getProductAddress())) {
            productDB.setProductAddress(
                product.getProductAddress());
        }
 
        if (Objects.nonNull(product.getProductCode())
            && !"".equalsIgnoreCase(
                product.getProductCode())) {
            productDB.setProductCode(
                product.getProductCode());
        }
 
        return productRepository.save(productDB);
    }
 
    // Delete operation
    @Override
    public void deleteProductById(Long productId)
    {
        productRepository.deleteById(productId);
    }
}