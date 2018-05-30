package com.liuxc.restfult.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.liuxc.restfult.domain.User;

@Mapper
public interface IUserDao {
	public List<User> findAll();
}
