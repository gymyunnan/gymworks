package com.example.demo.mapper;

import com.example.demo.dao.SelectUserOrdersById;
import com.example.demo.dao.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper {
    public User selectUserOrdersById1(Integer id);
    public User selectUserOrdersById2(Integer id);

    public List<SelectUserOrdersById> selectUserOrdersById3(Integer id);
}
