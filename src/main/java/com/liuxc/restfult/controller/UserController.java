package com.liuxc.restfult.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.liuxc.restfult.domain.User;
import com.liuxc.restfult.service.IUserService;

@RestController
@RequestMapping("/user")
public class UserController extends AbstractBaseController {

	@Autowired
	private IUserService userService;

	@RequestMapping("/findAll")
	public List<User> findAll() {
		System.out.println(get("url"));
		return userService.findAll();
	}
}
