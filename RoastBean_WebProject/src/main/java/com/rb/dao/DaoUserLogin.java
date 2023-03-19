package com.rb.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import com.rb.dto.DtoUser;
import com.rb.dto.DtoUserLogin;

public class DaoUserLogin {

	DataSource dataSource;

	public DaoUserLogin() {
		try {
			Context context = new InitialContext();
			dataSource = (DataSource) context.lookup("java:comp/env/jdbc/roastbean");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	// loginCheck
	public DtoUserLogin loginCheck(String user_id, String user_pw) {
		DtoUserLogin dto = null;
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;

		try {
			connection = dataSource.getConnection();

			String query = "select count(*), user_nick from user where user_id = ? and user_pw = ? and user_deletedate is null ";
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, user_id);
			preparedStatement.setString(2, user_pw);
			resultSet = preparedStatement.executeQuery();

			if (resultSet.next()) {
				int check = resultSet.getInt(1);
				String user_nick = resultSet.getString(2);
				
				dto = new DtoUserLogin(check, user_nick);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (resultSet != null)
					resultSet.close();
				if (preparedStatement != null)
					preparedStatement.close();
				if (connection != null)
					connection.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return dto;

	} // loginCheck
	
	// loginCheckApi
	public DtoUserLogin loginCheckApi(String user_id) {
		DtoUserLogin dto = null;
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		
		try {
			connection = dataSource.getConnection();
			
			String query = "select count(*), user_nick from user where user_id = ? and user_deletedate is null ";
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, user_id);
			resultSet = preparedStatement.executeQuery();
			
			if (resultSet.next()) {
				int check = resultSet.getInt(1);
				String user_nick = resultSet.getString(2);
				
				dto = new DtoUserLogin(check, user_nick);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (resultSet != null)
					resultSet.close();
				if (preparedStatement != null)
					preparedStatement.close();
				if (connection != null)
					connection.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return dto;
		
	} // loginCheckApi

	// Login Action : Admin Check
	public int loginCheckAdmin(String user_id, String user_pw) {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		int check = 0;

		try {
			connection = dataSource.getConnection();

			String query = "select count(*) from admin where admin_id = ? and admin_pw = ? ";

			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, user_id);
			preparedStatement.setString(2, user_pw);
			resultSet = preparedStatement.executeQuery();

			if (resultSet.next()) {
				check = resultSet.getInt(1);
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (resultSet != null)
					resultSet.close();
				if (preparedStatement != null)
					preparedStatement.close();
				if (connection != null)
					connection.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return check;
	} // login
	
	public DtoUser cartCount(String uuser_id) {
		DtoUser dtos = null;
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;

		try {
			connection = dataSource.getConnection();

			String query1 = "select sum(cart_qty) as cartCount from cart where user_id = '" + uuser_id + "'";

			preparedStatement = connection.prepareStatement(query1);
			resultSet = preparedStatement.executeQuery();

			if (resultSet.next()) {
				int cartCount = resultSet.getInt("cartCount");

				dtos = new DtoUser(cartCount);
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (resultSet != null)
					resultSet.close();
				if (preparedStatement != null)
					preparedStatement.close();
				if (connection != null)
					connection.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return dtos;
	}

} // End
