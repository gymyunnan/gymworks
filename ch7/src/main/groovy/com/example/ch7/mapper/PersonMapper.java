package com.example.ch7.mapper;

import com.example.ch7.pojo.Person;
import com.example.ch7.pojo.SelectPersonById;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;


@Repository
//@Mapper
public interface PersonMapper {
    public Person selectPersonById1(Integer id);

    public Person selectPersonById2(Integer id);

    public SelectPersonById selectPersonById3(Integer id);

}
