package annotation.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import annotation.dao.TestDao;

@Service("testServiceImpl")
public class TestServiceImpl implements TestService {
	
	@Resource(name = "testDaoImpl")
	private TestDao testDao;
	@Override
	public void save() {
		
		testDao.save();
		System.out.println("testService save");
		
	}
	
}
