package dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import po.Apple;

@Repository("appleDao")
public interface AppleDao {
	public Apple selectAppleById(Integer id);
	public List<Apple> selectAllApple();
	public int addApple(Apple apple);
	public int updateApple(Apple apple);
	public int deleteApple(Integer id);	
}
