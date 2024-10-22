package com.mustafaergan.product.repository;

import com.mustafaergan.product.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, String> {
    Customer getCustomersById(String id);
}
