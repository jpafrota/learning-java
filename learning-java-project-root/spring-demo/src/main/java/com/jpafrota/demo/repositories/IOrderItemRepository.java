package com.jpafrota.demo.repositories;

import com.jpafrota.demo.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IOrderItemRepository extends JpaRepository<OrderItem, Long> {

}
