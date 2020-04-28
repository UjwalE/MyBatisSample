package com.sboot.app.mybatis.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sboot.app.mybatis.entity.Item;
import com.sboot.app.mybatis.mapper.ItemMapper;

@Service
public class MyBatisServiceImpl implements MyBatisService {
	
	@Autowired
	ItemMapper mapper;
	

	@Override
	public Item getItem(int id) {
		Item item = mapper.getItem(id);
        return item;
	}

	@Override
	public String addItem(Item item) {

		try {
			mapper.addItem(item);
		}
		catch (Exception e) {
			e.printStackTrace();
			return "Failed to Add Item";
		}
        return "Item Added Successully";
        }

	@Override
	public String deleteItem(int id) {
		boolean flag = mapper.deleteItem(id);
        return flag?"Deleted":"Error";
	}

}
