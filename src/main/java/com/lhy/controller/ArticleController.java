package com.lhy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.github.pagehelper.PageInfo;
import com.lhy.bean.Article;
import com.lhy.bean.Vo;
import com.lhy.service.ArticleService;

@Controller
public class ArticleController {
	
	@Autowired
	ArticleService service;
	
	@RequestMapping("list")
	public String list(Model m,@RequestParam(defaultValue = "1")int pageNum,Vo vo) {
		PageInfo<Article> info = service.select(vo, pageNum);
		m.addAttribute("info",info);
		return "list";
	}

}
