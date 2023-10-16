package com.example.demo.repository;

import com.example.demo.entity.CheckoutEntity;
import org.springframework.data.repository.CrudRepository;

public interface CheckoutRepository extends CrudRepository<CheckoutEntity, Integer> {
    // You can add custom queries here if needed
}
