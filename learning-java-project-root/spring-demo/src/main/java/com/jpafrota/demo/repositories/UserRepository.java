package com.jpafrota.demo.repositories;

import com.jpafrota.demo.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;


// We do not need to annotate this as @Repository bc we already
// extend from JpaRepository, which has that annotation
public interface UserRepository extends JpaRepository<User, Long> {

}
