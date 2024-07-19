package com.jpafrota.demo.repositories;

import com.jpafrota.demo.entities.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPaymentRepository extends JpaRepository<Payment, Long> {

}
