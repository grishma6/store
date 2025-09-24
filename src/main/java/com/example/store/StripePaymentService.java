package com.example.store;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

//@Service("stripe")
//@Primary
public class StripePaymentService implements PaymentService {
    @Value("${stripe.api-url}")
    private String apiUrl;

    @Value("${stripe.enabled}")
    private boolean enabled;

    @Value("${stripe.timeout}")
    private int timeout;

    @Value("${stripe.supported-currencies}")
    private List<String> supportedCurrencies;
    @Override
    public void processPayment(double amount){
        System.out.println("STRIPE");
        System.out.println("ApiUrl: " + apiUrl);
        System.out.println("Enabled: " + enabled);
        System.out.println("Timeout: " + timeout);
        System.out.println("Supported Currencies: " + supportedCurrencies);
        System.out.println("Amount: " + amount);
    }
}

