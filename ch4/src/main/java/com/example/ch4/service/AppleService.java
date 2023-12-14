package com.example.ch4.service;

import com.example.ch4.annotation.TestApple;
import com.example.ch4.pojo.Apple;
import com.example.ch4.mapper.AppleMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AppleService {
    @Autowired
    AppleMapper appleMapper;

    @TestApple
    public int addApple(Apple apple){
        return appleMapper.addApple(apple);
    }

    public int getAppleCount(){
        return appleMapper.getAppleCount();
    }
}
