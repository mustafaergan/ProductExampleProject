package com.mustafaergan.product.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.UuidGenerator;

import java.util.List;

@Entity
@Table(name = "PRODUCT")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    @Id
    @UuidGenerator
    private String id;
    private String name;
    private String description;
    private double price;
    private int quantity;
    @ManyToMany(mappedBy = "products", cascade = CascadeType.ALL)
    private List<Customer> customers;
}
