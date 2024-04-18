package com.redvinca.backend.template.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
 
// Annotations 
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
// Class 
public class Product {
 
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long productId;
    private String productName;
    private String productType;
    private String productCode;
}