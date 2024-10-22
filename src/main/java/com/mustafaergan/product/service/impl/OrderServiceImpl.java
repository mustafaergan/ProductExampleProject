package com.mustafaergan.product.service.impl;

import com.mustafaergan.product.entity.CustomerOrder;
import com.mustafaergan.product.repository.OrderRepository;
import com.mustafaergan.product.service.OrderService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@AllArgsConstructor
public class OrderServiceImpl implements OrderService {

    private final OrderRepository orderRepository;

    @Override
    public CustomerOrder getOrderById(String id) {
        return orderRepository.findById(id).orElse(null);
    }

    @Override
    public CustomerOrder createOrder(CustomerOrder customerOrder) {
        return orderRepository.save(customerOrder);
    }

    @Override
    public List<CustomerOrder> getAllOrders() {
        return orderRepository.findAll();
    }

    @Override
    public CustomerOrder updateOrder(String id, CustomerOrder customerOrder) {
        if (orderRepository.existsById(id)) {
            customerOrder.setId(id);
            return orderRepository.save(customerOrder);
        }
        return null;
    }

    @Override
    public void deleteOrder(String id) {
        orderRepository.deleteById(id);
    }
}
