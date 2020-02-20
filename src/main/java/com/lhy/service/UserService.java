package com.lhy.service;

import java.util.List;


import com.github.pagehelper.PageInfo;
import com.lhy.bean.Vo;

public interface UserService {
	
	PageInfo select(Vo vo,int pageNum);
	
}
