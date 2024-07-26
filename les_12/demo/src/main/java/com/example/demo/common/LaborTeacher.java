package com.example.demo.common;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
//@Lazy
public class LaborTeacher implements Teacher{
    public LaborTeacher() {
        System.out.println("Bean of the class" + this.getClass().getSimpleName());
    }

    @Override
    public String getHomeWork() {
        return "Make chairs";
    }
}
