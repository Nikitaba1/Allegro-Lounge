package com.Book_lounge.genericUtility;
/**
 * 
 * @author : Nikitaba Parmar
 * 
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class DataBase_Utility {
	Connection conn;
	/**
	 * 
	 * This method is used to get Connection 
	 * @param url 
	 * @param username
	 * @param password
	 * @throws Exception
	 */
	public void getConnection(String url,String username,String password) throws Exception {
		try {
		Driver d = new Driver();
		DriverManager.registerDriver(d);
		DriverManager.getConnection(url, username, password);
		}catch (Exception e) {}
	}
	/**
	 * Creating Statment and Execute select Query
	 * @param Query
	 * @return
	 * @throws Exception
	 */
	public ResultSet getExecuteSelectQuery(String Query) throws Exception {
		ResultSet result;
		Statement stat = conn.createStatement();
		result=stat.executeQuery(Query);
		return result;
	}
	/**
	 * Creating Statment and Execute Non-select Query
	 * @param Query
	 * @return
	 * @throws Exception
	 */
	public int getExecuteNonSelectQuery(String Query) throws Exception{
		int result;
		Statement st= conn.createStatement();
		result=st.executeUpdate(Query);
		return result;
	}	
	}


