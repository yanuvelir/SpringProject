package com.example.demo.common;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
//@Lazy
public class HistoryTeacher implements Teacher{
    public HistoryTeacher() {
        System.out.println("Bean of the class" + this.getClass().getSimpleName());
    }

    @Override
    public String getHomeWork() {
        return "Learn the story of the 15th century";
    }
}
