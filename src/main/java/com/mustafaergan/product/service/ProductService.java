package com.mustafaergan.product.service;

import com.mustafaergan.product.entity.Product;

import java.util.List;

public interface ProductService {

    Product getProductById(String id);

    Product createProduct(Product product);

    List<Product> getAllProducts();

    Product updateProduct(String id, Product product);

    void deleteProduct(String id);
}