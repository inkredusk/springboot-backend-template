package com.redvinca.backend.template.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
 
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
 
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