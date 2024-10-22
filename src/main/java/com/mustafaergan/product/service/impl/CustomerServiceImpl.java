package com.mustafaergan.product.service.impl;

import com.mustafaergan.product.entity.Customer;
import com.mustafaergan.product.repository.CustomerRepository;
import com.mustafaergan.product.repository.ProductRepository;
import com.mustafaergan.product.service.CustomerService;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class CustomerServiceImpl implements CustomerService {

    private final CustomerRepository customerRepository;

    private final ProductRepository productRepository;

    @Override
    public Customer getCustomerById(String id) {
        return customerRepository.getCustomersById(id);
    }

    @Override
    @Transactional
    public Customer createCustomer(Customer customer) {
        if (customer.getProducts() != null) {
            productRepository.saveAll(customer.getProducts());
        }
        return customerRepository.save(customer);
    }

    @Override
    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }
}
