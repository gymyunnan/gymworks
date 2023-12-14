package com.example.ch4.pojo;

import org.apache.ibatis.annotations.Insert;

public class Apple {
    private Integer id;
    private Double weight;
    private Double price;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Apple{" +
                "id=" + id +
                ", weight='" + weight + '\'' +
                ", price='" + price + '\'' +
                '}';
    }
}
