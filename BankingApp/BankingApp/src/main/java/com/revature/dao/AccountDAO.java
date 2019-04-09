package com.revature.dao;

import java.util.List;

import com.revature.beans.Account;

public interface AccountDAO {

	public List<Account> getAccounts();
	public Account getAccountById(int id);
	public void createAccount(Account account);
	public void updateAccount(Account account);
	public void deleteAccount(Account account);
	
}
