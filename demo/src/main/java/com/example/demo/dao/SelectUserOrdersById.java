package com.example.demo.dao;

public class SelectUserOrdersById {
    Integer id;
    String name;
    String sex;
    String ordersn;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getOrdersn() {
        return ordersn;
    }

    public void setOrdersn(String ordersn) {
        this.ordersn = ordersn;
    }

    @Override
    public String toString() {
        return "SelectUserOrdersById{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", ordersn='" + ordersn + '\'' +
                '}';
    }
}
