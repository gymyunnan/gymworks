package com.example.demo.mapper;

import com.example.demo.dao.Orders;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderMapper {
    public List<Orders> selectOrderById(Integer id);
}
