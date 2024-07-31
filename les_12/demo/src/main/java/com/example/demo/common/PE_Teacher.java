package com.example.demo.common;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
//@Lazy
public class PE_Teacher implements Teacher{
    public PE_Teacher() {
        System.out.println("Bean of the class - " + this.getClass().getSimpleName());
    }

    @Override
    public String getHomeWork() {
        return "Have to run 10 km";
    }
}
