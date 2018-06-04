package com.example.demo.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.springboot.bean.Response;
import com.example.demo.springboot.bean.User;
import com.example.demo.springboot.dao.UserDao;
import com.example.demo.springboot.util.ResultUtil;

@RestController
@RequestMapping("users")
public class UserController {
	@Autowired
    private UserDao userDao;
	
	@RequestMapping(value ="/user",method = RequestMethod.POST)
	public Response Insert(@RequestBody User user) {
        user.setUsername(user.getUsername()+Math.random());
        user.getPassword();
        user.getBirthday();
        
//        int result = this.userDao.insert(user);
        System.out.println(user.getUsername());
        return ResultUtil.success(this.userDao.insert(user));
    }
	
	@RequestMapping(value ="/getById",method = RequestMethod.POST)
	public Response getById(@RequestBody Integer id) {
		System.out.println("userId:"+id);
		return ResultUtil.success(this.userDao.getById(id));
	}
}
