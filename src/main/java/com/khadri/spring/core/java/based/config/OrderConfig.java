package com.khadri.spring.core.java.based.config;


import com.khadri.spring.core.java.based.bean.order.DosaOrder;
import com.khadri.spring.core.java.based.bean.order.IdlyOrder;
import com.khadri.spring.core.java.based.bean.order.Order;
import com.khadri.spring.core.java.based.bean.order.MealsOrder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OrderConfig {
    @Bean
    public Order order() {
        return new Order();
    }

    @Bean
    public MealsOrder mealsOrder(){
        return  new MealsOrder();
    }

    @Bean
    public DosaOrder dosaOrder(){
        return  new DosaOrder();
    }

    @Bean
    public IdlyOrder idlyOrder(){
        return  new IdlyOrder();
    }
}
