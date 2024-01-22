package project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {
	private static final String SCHEMA = "project";
	private static final String USER = "project";
	private static final String PASSWORD = "project";
	private static final String HOST = "localhost";
	private static final int PORT = 3306;

	public static Connection getConnection() {
		String url = String.format("jdbc:mysql://%s:%d:/%s?user=&s&password=%s&useSSL=false", HOST, PORT, SCHEMA, USER,
				PASSWORD);
		
		System.out.println("conneting with url=" + url);
		
		try {
			Connection conn = DriverManager.getConnection(url);
		} catch (SQLException e) {
			
		}

	}
}
