package com.example.demo.common;

import org.springframework.stereotype.Component;

//@Component
public class EnglishTeacher implements Teacher{

    public EnglishTeacher() {
        System.out.println("Bean of the class - " + this.getClass().getSimpleName());
    }

    @Override
    public String getHomeWork() {
        return "To learn new 100 words.";
    }
}
