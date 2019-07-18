package com.example.demo.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.springboot.bean.Role;

public interface RoleRepository extends JpaRepository<Role, Integer>{
//	public Role findOne(Integer id);
//	public void delete(Integer id);
}
