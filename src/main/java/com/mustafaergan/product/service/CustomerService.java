package com.mustafaergan.product.service;

import com.mustafaergan.product.entity.Customer;

import java.util.List;

public interface CustomerService {
    Customer getCustomerById(String id);

    Customer createCustomer(Customer customer);

    List<Customer> getAllCustomers();
}
