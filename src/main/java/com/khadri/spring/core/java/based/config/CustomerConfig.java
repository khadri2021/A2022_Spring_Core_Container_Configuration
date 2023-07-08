package com.khadri.spring.core.java.based.config;

import com.khadri.spring.core.java.based.bean.customer.Customer;
import com.khadri.spring.core.java.based.bean.customer.NonPrimeCustomer;
import com.khadri.spring.core.java.based.bean.customer.PrimeCustomer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CustomerConfig {
    @Bean
    public Customer customer() {
        return new Customer();
    }

    @Bean
    public PrimeCustomer primeCustomer() {
        return new PrimeCustomer();
    }

    @Bean
    public NonPrimeCustomer nonPrimeCustomer() {
        return new NonPrimeCustomer();
    }
}
