package service;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.AppleDaoImpl;
import domain.Apple;

@Service("appleService")
public class AppleServiceImpl {
	
	@Autowired
	private AppleDaoImpl appleDao;
	
	public Apple getApple() {
		Apple apple = appleDao.getApple();
		return apple;
	}
	
}
