package com.sboot.app.mybatis.mapper;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;

import com.sboot.app.mybatis.entity.Item;

public interface ItemMapper {
    @Select("SELECT * FROM ITEMS WHERE id = #{id}")
    Item getItem(@Param("id") Integer id);
    
    
    @Insert("INSERT INTO ITEMS (id, name) VALUES (#{id}, #{name})")
    void addItem(Item item);
    
    @Delete("DELETE FROM ITEMS WHERE id = #{id}")
    boolean deleteItem(@Param("id") Integer id);
    
}

