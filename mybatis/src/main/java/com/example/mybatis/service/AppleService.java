package com.example.mybatis.service;

import com.example.mybatis.mapper.AppleMapper;
import com.example.mybatis.pojo.MyApple;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AppleService {

    @Autowired
    AppleMapper appleMapper;

    public MyApple selectAppleById(Integer id){return appleMapper.selectAppleById(id);}

    public List<MyApple> selectAllApple(){
        return appleMapper.selectAllApple();
    }

    public int addMyApple(MyApple apple){
        return appleMapper.addMyApple(apple);
    }

    public int updateApple(MyApple apple){
        return appleMapper.updateApple(apple);
    }

    public int deleteApple(Integer id){
        return appleMapper.deleteApple(id);
    }

    public MyApple selectLeast(){
        return appleMapper.selectLeastApple();
    }
}
