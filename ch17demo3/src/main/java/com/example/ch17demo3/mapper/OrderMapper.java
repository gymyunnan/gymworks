package com.example.ch17demo3.mapper;


import com.example.ch17demo3.pojo.Orders;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderMapper {
    public List<Orders> selectOrderById(Integer id);
    public List<Orders> selectallOrdersAndProducts();
}
