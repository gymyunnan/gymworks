package com.mybatis.test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.mybatis.apple.Apple;


public class MyBatisTest {

	public static void main(String[] args) {
		try {
			InputStream config = Resources.getResourceAsStream("mybatis-config.xml");
			SqlSessionFactory ssf = new SqlSessionFactoryBuilder().build(config);
			SqlSession ss = ssf.openSession();
			
			//查询一个苹果
			Apple apple = ss.selectOne("com.mybatis.mapper.AppleMapper.selectAppleById", 1);
			System.out.println(apple);
			
			//添加一个苹果,id自增
//			Apple blankApple = new Apple();
//			blankApple.setColor("blank");
//			blankApple.setName("blankApple");
//			blankApple.setPrice(9.0);
//			ss.insert("com.mybatis.mapper.AppleMapper.addApple",blankApple);
			
			//修改一个苹果
			Apple apple2 = new Apple();
			apple2.setId(1);
			apple2.setColor("red");
			apple2.setName("redApple");
			apple2.setPrice(10.0);
			ss.update("com.mybatis.mapper.AppleMapper.updateApple", apple2);
			
			//删除一个苹果
			ss.delete("com.mybatis.mapper.AppleMapper.deleteApple", 5);
			
			//查询所有的苹果
			List<Apple> list = ss.selectList("com.mybatis.mapper.AppleMapper.selectAllApple");
			for (Apple apple1 : list) {
				System.out.println(apple1);
			}
			
			ss.commit(); 
			ss.close();
			
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
