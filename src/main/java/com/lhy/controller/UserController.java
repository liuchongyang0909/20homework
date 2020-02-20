package com.lhy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.github.pagehelper.PageInfo;
import com.lhy.bean.User;
import com.lhy.bean.Vo;
import com.lhy.service.UserService;

@Controller
public class UserController {
	
	@Autowired
	UserService service;
	
	@RequestMapping("list")
	public String list(Model m,@RequestParam(defaultValue = "1")int pageNum,Vo vo) {
		PageInfo<User> info = service.select(vo, pageNum);
		m.addAttribute("info",info);
		return "list";
	}

}
