package com.jpafrota.demo.repositories;

import com.jpafrota.demo.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IOrderRepository extends JpaRepository<Order, Long> {

}
