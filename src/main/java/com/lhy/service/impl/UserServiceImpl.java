package com.lhy.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.lhy.bean.User;
import com.lhy.bean.Vo;
import com.lhy.mapper.UserMapper;
import com.lhy.service.UserService;
@Service
public class UserServiceImpl implements UserService {
	@Autowired
	UserMapper mapper;

	public PageInfo select(Vo vo,int pageNum) {
		// TODO Auto-generated method stub
		PageHelper.startPage(pageNum,3);
		List<User> user=mapper.select(vo);
		PageInfo<User> info=new PageInfo<User>(user);
		return info;
	}

}
