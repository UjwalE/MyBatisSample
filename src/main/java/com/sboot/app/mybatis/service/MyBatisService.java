package com.sboot.app.mybatis.service;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;

import com.sboot.app.mybatis.entity.Item;

public interface MyBatisService {
	
	 Item getItem(int id);
	 
	 String addItem(Item item);
	 
	 String deleteItem(int id);

}
