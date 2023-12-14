package com.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.po.Apple;

@Repository("appleDao")
@Mapper
public interface AppleDao {
	public List<Apple> selectAppleByName(Apple apple);
}
