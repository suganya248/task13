package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ResourceBundle;

//Singleton
public class Db {
	private Db() {
		// TODO Auto-generated constructor stub
	}

	public static Connection getCon() throws ClassNotFoundException, SQLException {
		ResourceBundle bundle = ResourceBundle.getBundle("db");
		Class.forName(bundle.getString("driver"));
		Connection con = DriverManager.getConnection(bundle.getString("con"), bundle.getString("user"),
				bundle.getString("pass"));
		return con;
	}
}