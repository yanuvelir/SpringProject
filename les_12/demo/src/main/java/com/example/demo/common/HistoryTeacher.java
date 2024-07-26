package com.example.demo.common;

import org.springframework.stereotype.Component;

@Component
public class HistoryTeacher implements Teacher{

    @Override
    public String getHomeWork() {
        return "Learn the story of the 15th century";
    }
}
