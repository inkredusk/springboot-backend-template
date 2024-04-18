package com.redvinca.backend.template.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.redvinca.backend.template.entity.Product;
 
// Annotation
@Repository
// Interface
public interface ProductRepository
    extends JpaRepository<Product, Long> {
}