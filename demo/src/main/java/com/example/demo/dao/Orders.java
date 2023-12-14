package com.example.demo.dao;

import java.util.List;

public class Orders {
    Integer id;
    String ordersn;



    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOrdersn() {
        return ordersn;
    }

    public void setOrdersn(String ordersn) {
        this.ordersn = ordersn;
    }

    @Override
    public String toString() {
        return "orders{" +
                "id=" + id +
                ", ordersn='" + ordersn + '\'' +
                '}';
    }
}
