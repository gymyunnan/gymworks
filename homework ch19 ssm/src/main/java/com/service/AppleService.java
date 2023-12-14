package com.service;

import java.util.List;

import com.po.Apple;

public interface AppleService {
	public List<Apple> selectAppleByName(Apple apple);
}
