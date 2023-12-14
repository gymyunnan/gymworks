package com.example.ch4.mapper;

import com.example.ch4.pojo.Apple;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

//@Mapper
public interface AppleMapper {
    @Insert("insert into apple (id,weight, price) values  (#{id}, #{weight}, #{price})")
    public int addApple(Apple apple);

    @Select("select count(*) from apple")
    public int getAppleCount();
}
