package annotation2.service;

import annotation2.dao.TestDao;

public class TestService {
	TestDao testDao;

	public void setTestDao(TestDao testDao) {
		this.testDao = testDao;
	}
	public void save() {
		testDao.save();
	}
}
