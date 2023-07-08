package com.khadri.spring.core.java.based;


import com.khadri.spring.core.java.based.bean.order.IdlyOrder;
import com.khadri.spring.core.java.based.bean.customer.PrimeCustomer;
import com.khadri.spring.core.java.based.config.CustomerConfig;
import com.khadri.spring.core.java.based.config.OrderConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(OrderConfig.class, CustomerConfig.class);

        IdlyOrder idlyOrder = context.getBean(IdlyOrder.class);
        System.out.println(idlyOrder);

        PrimeCustomer primeCustomer = context.getBean(PrimeCustomer.class);
        System.out.println(primeCustomer);
    }
}