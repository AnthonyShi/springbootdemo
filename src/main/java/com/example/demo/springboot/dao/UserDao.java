package com.example.demo.springboot.dao;

import com.example.demo.springboot.bean.User;

public interface UserDao {
	public int insert(User user);
    
    public int deleteById(Integer id);
    
    public int update(User user);
    
    public User getById(Integer id);
}
