package com.example.demo.controller;

import com.example.demo.entity.CheckoutEntity;
import com.example.demo.service.CheckoutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin("*")
@RestController
@RequestMapping("auth/checkout")
public class CheckoutController {

    private final CheckoutService checkoutService;

    @Autowired
    public CheckoutController(CheckoutService checkoutService) {
        this.checkoutService = checkoutService;
    }

    @PostMapping("/create")
    public CheckoutEntity createCheckout(@RequestBody CheckoutEntity checkout) {
        return checkoutService.saveCheckout(checkout);
    }

    @GetMapping("/{id}")
    public CheckoutEntity getCheckoutById(@PathVariable int id) {
        return checkoutService.getCheckoutById(id);
    }

    @GetMapping("/all")
    public Iterable<CheckoutEntity> getAllCheckouts() {
        return checkoutService.getAllCheckouts();
    }
    
}
