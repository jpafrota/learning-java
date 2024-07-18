package com.jpafrota.demo.repositories;

import com.jpafrota.demo.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICategoryRepository extends JpaRepository<Category, Long> {

}
