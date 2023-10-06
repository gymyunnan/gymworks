package service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.ObjectMapper;

import dao.AppleDaoImpl;
import domain.Apple;

//@Service("appleServiceImpl")
public class AppleServiceImpl {

//	@Resource(name="appleDaoImpl")
	AppleDaoImpl appleDao;
	
	
	
	public AppleDaoImpl getAppleDao() {
		return appleDao;
	}



	public void setAppleDao(AppleDaoImpl appleDao) {
		this.appleDao = appleDao;
	}



	public String getApples() {
		
		List<Apple> Apples= appleDao.getApples();
		ObjectMapper objectMapper = new ObjectMapper();
		
		try {
			
			return objectMapper.writeValueAsString(Apples);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return null;
	}
}

