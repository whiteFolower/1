package kr.or.ddit.Test;

import java.util.List;
import java.util.Map;

public class TestService {

	private static TestService instance = null;
	
	private TestService() {
		
	}
	public static TestService getInstance() {
		if(instance == null) {
			instance = new TestService();
		}
		return instance;
	}
	TestDao testDao = TestDao.getInstance();
	
	public List<Map<String, Object>> TestList() {
		return testDao.TestList();
	}
	

}
