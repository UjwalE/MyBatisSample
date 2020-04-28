package com.sboot.app.mybatis.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sboot.app.mybatis.entity.Item;
import com.sboot.app.mybatis.service.MyBatisService;


@RestController
public class MySampleController {
	
	@Autowired
	MyBatisService service;
	
	@RequestMapping(method = RequestMethod.GET ,value = "/item/{id}")
    public Item getItem(@PathVariable int id){
		Item item = service.getItem(id);
        return item;
    }
	
	
	@PostMapping("/item")
    public String addItem(@RequestBody Item item){
		return service.addItem(item);
    }
	
	
	/*
	 * @RequestMapping(method = RequestMethod.GET ,value = "/item/{id}") public Item
	 * getItem(@PathVariable int id){ Item item = mapper.getItem(1); return item; }
	 */
	
	
	@RequestMapping(method = RequestMethod.DELETE, value = "/item/{id}")
    public String deleteItem(@PathVariable int id){
		return service.deleteItem(id);
    }
	
	

}
