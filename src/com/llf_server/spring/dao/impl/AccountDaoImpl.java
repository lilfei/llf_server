package com.llf_server.spring.dao.impl;

import org.springframework.stereotype.Component;

import com.llf_server.spring.dao.IAcountDao;

@Component(value="accountDao")
public class AccountDaoImpl implements IAcountDao {

	@Override
	public void saveAccount() {
		// TODO Auto-generated method stub
		System.out.println("调用了持久层1111111");
	}

}
