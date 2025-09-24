package com.example.store;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

//@Service
public class OrderService {
    private PaymentService paymentService;

    public OrderService(PaymentService paymentService) {
        this.paymentService = paymentService;
        System.out.println("OrderService Created");
    }

    @PostConstruct
    public void init(){
        System.out.println("OrderService PostConstruct");
    }

    @PreDestroy
    public void cleanUp(){
        System.out.println("OrderService PreDestroy");
    }

    public void placeOrder() {
        paymentService.processPayment(10);
    }
}





