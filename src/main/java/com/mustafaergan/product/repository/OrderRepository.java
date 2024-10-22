package com.mustafaergan.product.repository;

import com.mustafaergan.product.entity.CustomerOrder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<CustomerOrder, String> {

}
