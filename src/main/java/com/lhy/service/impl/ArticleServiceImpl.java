package com.lhy.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.lhy.bean.Article;
import com.lhy.bean.Vo;
import com.lhy.mapper.ArticleMapper;
import com.lhy.service.ArticleService;
@Service
public class ArticleServiceImpl implements ArticleService {
	@Autowired
	ArticleMapper mapper;

	public PageInfo select(Vo vo,int pageNum) {
		// TODO Auto-generated method stub
		PageHelper.startPage(pageNum,3);
		List<Article> user=mapper.select(vo);
		PageInfo<Article> info=new PageInfo<Article>(user);
		return info;
	}

}
