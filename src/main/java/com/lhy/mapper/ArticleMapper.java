package com.lhy.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.lhy.bean.Vo;

public interface ArticleMapper {
	
	List select(Vo vo);

}
