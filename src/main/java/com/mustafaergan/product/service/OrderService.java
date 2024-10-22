package com.mustafaergan.product.service;

import com.mustafaergan.product.entity.CustomerOrder;

import java.util.List;

public interface OrderService {
    CustomerOrder getOrderById(String id);

    CustomerOrder createOrder(CustomerOrder customerOrder);

    List<CustomerOrder> getAllOrders();

    CustomerOrder updateOrder(String id, CustomerOrder customerOrder);

    void deleteOrder(String id);
}
