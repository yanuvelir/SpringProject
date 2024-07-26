package com.example.demo.common;

import org.springframework.stereotype.Component;

@Component
public class PE_Teacher implements Teacher{
    @Override
    public String getHomeWork() {
        return "Have to run 10 km";
    }
}
