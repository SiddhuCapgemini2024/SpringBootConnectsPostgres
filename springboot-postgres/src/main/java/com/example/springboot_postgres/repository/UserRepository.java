package com.example.springboot_postgres.repository;

import com.example.springboot_postgres.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    // You can define custom query methods here if needed
}
