package com.example.demo.service;

import com.example.demo.entity.CheckoutEntity;
import com.example.demo.repository.CheckoutRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CheckoutService {
    private final CheckoutRepository checkoutRepository;

    @Autowired
    public CheckoutService(CheckoutRepository checkoutRepository) {
        this.checkoutRepository = checkoutRepository;
    }

    public CheckoutEntity saveCheckout(CheckoutEntity checkout) {
        return checkoutRepository.save(checkout);
    }

    public CheckoutEntity getCheckoutById(int id) {
        return checkoutRepository.findById(id).orElse(null);
    }

    public Iterable<CheckoutEntity> getAllCheckouts() {
        return checkoutRepository.findAll();
    }

    public void deleteCheckoutById(int id) {
        checkoutRepository.deleteById(id);
    }

    // You can implement other CRUD methods if needed
}
