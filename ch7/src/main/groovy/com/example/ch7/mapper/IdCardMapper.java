package com.example.ch7.mapper;

import com.example.ch7.pojo.Idcard;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
//@Mapper
public interface IdCardMapper {
    public Idcard selectCodeById(Integer id);
}