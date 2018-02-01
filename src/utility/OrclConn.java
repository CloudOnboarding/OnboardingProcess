package utility;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.Reporter;

public class OrclConn {

	private static Connection connection;

	private static String url;
	private static Statement stmt;
	public static ResultSet rset;

	public static void OpenDBConnection(String serName, String portNum, String osid, String dbUserName,
			String dbPassword) {
		try {
			url = "jdbc:oracle:thin:@" + serName + ":" + portNum + ":" + osid; // "jdbc:oracle:thin:@" + serverName +
																				// ":" + portNumber + ":" + sid;
			// Load the JDBC driver
			String driverName = "oracle.jdbc.driver.OracleDriver";
			Class.forName(driverName);

			// Create a connection to the database
			connection = DriverManager.getConnection(url, dbUserName, dbPassword);
		}

		catch (ClassNotFoundException e) {
			Reporter.log("Class not found from database");
			e.printStackTrace();
		} catch (SQLException e1) {
			Reporter.log("ORACLE Connection error ");
			e1.printStackTrace();
		}

	}

	/*
	 * This Function execute the query on the connected database and return the
	 * ResultSet collection Upon callling from the test case class where actual
	 * verification is being done on UI and Database.
	 */
	public static ResultSet RunQuery(String Query) throws IOException {

		try {
			stmt = connection.createStatement();
			rset = stmt.executeQuery(Query);

		} catch (SQLException e1) {
			Reporter.log("Query Execution Error");
			e1.printStackTrace();
		}

		return rset;
	}

	/*
	 * This Function closes the database connection from the Oracle Database
	 * Connection Upon callling from the test case class where actual verification
	 * is being done.
	 */
	public static void OracleCloseConnection() throws IOException {
		try {
			connection.close();
		}

		catch (SQLException e1) {
			Reporter.log("Query Execution Error");
			e1.printStackTrace();

		}

	}

}
