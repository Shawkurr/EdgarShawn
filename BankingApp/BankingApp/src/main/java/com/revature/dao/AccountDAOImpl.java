package com.revature.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.revature.beans.Account;
import com.revature.util.ConnectionUtil;

public class AccountDAOImpl implements AccountDAO{

	public List<Account> getAccounts() {
		List<Account> acc = new ArrayList<Account>();
		try(Connection con = ConnectionUtil.getConnection()){
			String sql = "SELECT ACCOUNT_ID, ACCOUNT_NUMBER, USER_ID,BALANCE "
					+ "FROM ACCOUNTS";
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while (rs.next()) {
				int accountId = rs.getInt("ACCOUNT_ID");
				int accountNum = rs.getInt("ACCOUNT_NUMBER");
				//int userId = rs.getInt("USER_ID");
				double balance = rs.getDouble("BALANCE");
				acc.add(new Account(accountId, accountNum,balance));
			}
			
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return acc;
	}

	public Account getAccountById() {
		// TODO Auto-generated method stub
		return null;
	}

	public void createAccount(Account account) {
		// TODO Auto-generated method stub
		
	}

	public void updateAccount(Account account) {
		// TODO Auto-generated method stub
		
	}

	public void deleteAccount(Account account) {
		// TODO Auto-generated method stub
		
	}

	public Account getAccountById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
