package com.example.demo.common;

import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Lazy
//@Scope("prototype") // first way to define the Scope
@Scope(ConfigurableListableBeanFactory.SCOPE_PROTOTYPE) //second way to define a @Scope
public class MathTeacher implements Teacher {
    public MathTeacher() {
        System.out.println("Bean of the class" + this.getClass().getSimpleName());
    }

    @Override
    public String getHomeWork() {
        return "Решать уравнения.";
    }
}
