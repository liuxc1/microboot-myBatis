package com.liuxc.restfult.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.liuxc.restfult.dao.IUserDao;
import com.liuxc.restfult.domain.User;
import com.liuxc.restfult.service.IUserService;

@Service
public class UserServiceImpl implements IUserService {

	@Autowired
	private IUserDao userDao;

	@Override
	public List<User> findAll() {

		return userDao.findAll();
	}

}
