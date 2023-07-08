package com.khadri.spring.core.annotation.based;


import com.khadri.spring.core.annotation.based.bean.customer.PrimeCustomer;
import com.khadri.spring.core.annotation.based.config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
//        context.scan("com.khadri.spring.core.annotation.based");
//        context.refresh();

        PrimeCustomer primeCustomer = context.getBean(PrimeCustomer.class);
        System.out.println(primeCustomer);

    }
}