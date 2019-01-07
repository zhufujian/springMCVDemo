package com.study.demo.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;


public class ShiroDAO {
	
	private JdbcTemplate jdbcTemplate;
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
	    this.jdbcTemplate = jdbcTemplate;
	}
	
	/**
	 * 根据用户名查询密码
	 */
	public String getPasswordByUserName(String username) {
	    String sql = "select PASSWORD from SHIRO_USER where USERNAME = ?";
	    String password = jdbcTemplate.queryForObject(sql, String.class, username);
	    return password;
	}
	
	/**
	 * 查询当前用户对应的权限
	 */
	public List<String> getPermissionByUserName(String username) {
	    String sql = "select P.PERM_NAME from SHIRO_ROLE_PERMISSION P inner join SHIRO_USER_ROLE R on P.ROLE_NAME=R.ROLE_NAME where R.USERNAME = ?";
	    List<String> perms = jdbcTemplate.queryForList(sql, String.class, username);
	    return perms;
	}
}
