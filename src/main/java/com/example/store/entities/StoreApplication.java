package com.example.store.entities;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class StoreApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(StoreApplication.class, args);

        //var orderService = context.getBean(OrderService.class);
        //var orderService2 = context.getBean(OrderService.class);
        //orderService.placeOrder();

        //var resource = context.getBean(HeavyResource.class);


        //orderService.setPaymentService(new PaypalPaymentService());
        //orderService.placeOrder();

        //NotificationService manager = new EmailNotificationService();
        //manager.send("This is a test");


        var user = User.builder()
                .name("grishma")
                .id(1)
                .email("grishmagolla@gmail.com")
                .build();

        var address = Address.builder()
                //.zip("zip")
                .city("Dallas")
                .street("Farmers Branch")
                //.userId(5)
                .build();

        user.addAddress(address);
        System.out.println(user);


        //context.close();
    }
}

