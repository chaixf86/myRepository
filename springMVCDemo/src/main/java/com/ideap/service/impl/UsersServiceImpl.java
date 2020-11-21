package com.ideap.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.ideap.mapper.UsersMapper;
import com.ideap.pojo.Users;
import com.ideap.service.UsersService;

@Service
public class UsersServiceImpl implements UsersService{

	@Resource
	UsersMapper usersMapper;
	
	@Override
	public List<Users> show() {
		return usersMapper.selAll();
	}
	
	
}
