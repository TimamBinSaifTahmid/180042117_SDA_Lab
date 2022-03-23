package com.example.order_service.repository;

import com.example.order_service.entity.Order;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends MongoRepository<Order, String> {
    Order findOrderById(String userId);
}
