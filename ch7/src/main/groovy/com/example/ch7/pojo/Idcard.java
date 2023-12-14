package com.example.ch7.pojo;

public class Idcard {
    Integer id;
    String code;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return "Idcard{" +
                "id=" + id +
                ", code='" + code + '\'' +
                '}';
    }
}
