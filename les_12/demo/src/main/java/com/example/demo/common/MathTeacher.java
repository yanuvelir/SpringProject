package com.example.demo.common;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class MathTeacher implements Teacher {
    public MathTeacher() {
        System.out.println("Bean of the class" + this.getClass().getSimpleName());
    }

    @PostConstruct
    public void firstMethod(){
        System.out.println("firstMethod");
    }

    @PreDestroy
    public void secondMethod(){
        System.out.println("secondMethod");
    }

    @Override
    public String getHomeWork() {
        return "Решать уравнения.";
    }

}
