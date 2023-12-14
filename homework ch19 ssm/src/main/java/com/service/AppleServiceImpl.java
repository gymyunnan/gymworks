package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dao.AppleDao;
import com.po.Apple;

@Service("appleServiceImpl")
@Transactional
public class AppleServiceImpl implements AppleService{
	
	@Autowired
	private AppleDao appleDao;
	
	@Override
	public List<Apple> selectAppleByName(Apple apple) {
		return appleDao.selectAppleByName(apple);
	}

}
