package com.example.demo.common;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class HistoryTeacher implements Teacher{

    @Override
    public String getHomeWork() {
        return "Learn the story of the 15th century";
    }
}
