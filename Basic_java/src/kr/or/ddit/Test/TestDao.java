package kr.or.ddit.Test;

import java.util.List;
import java.util.Map;

public class TestDao {

	private static TestDao instance = null;
	
	private TestDao() {
		
	}
	
	public static TestDao getInstance() {
		if(instance == null) {
			instance = new TestDao();
		}
		return instance;
	}

	JDBCUtil jdbc = JDBCUtil.getInstance();
	
	public List<Map<String, Object>> TestList() {
		String sql = "";
		return jdbc.selectList(sql);
	}

	

}
