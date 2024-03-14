package kr.or.ddit.study06.sec05.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConn {
	private static Connection conn = null;
	
	public static Connection getConnection() {
		
		String url  ="jdbc:oracle:thin:@localhost:1521:xe";
		String user ="pc15";
		String pass ="java";
		
		
		if(conn == null) {
			try { 
				Class.forName("oracle.jdbc.driver.OracleDriver");
				conn = DriverManager.getConnection(url, user, pass); // 불러온 값은 conn에 저장
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}
		return conn;
	}
}

private static enclosing_type instance = null;

private enclosing_type() {

}

public static enclosing_type getInstance() {

	if (instance == null) {
		instance = new enclosing_type();
	}
	return instance;
}
