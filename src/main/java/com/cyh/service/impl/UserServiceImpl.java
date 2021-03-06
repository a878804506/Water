package com.cyh.service.impl;

import com.cyh.pojo.Role;
import org.springframework.beans.factory.annotation.Autowired;

import com.cyh.mapper.UserMapper;
import com.cyh.pojo.User;
import com.cyh.service.UserService;

import java.util.List;
import java.util.Map;

public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    public User CUser(User user) {
        return userMapper.CUser(user);
    }

    public void updateUser(User user) {
        userMapper.updateUser(user);
    }

    @Override
    public List<User> getAllUsers() {
        return userMapper.getAllUsers();
    }

    @Override
    public int updateUserStrutsByUid(int uid, int struts) {
        return userMapper.updateUserStrutsByUid(uid,struts);
    }

    @Override
    public User getUserById(int uid) {
        return userMapper.getUserById(uid);
    }

    @Override
    public int updateUserPwdByUid(int uid, String newPwd) {
        return userMapper.updateUserPwdByUid(uid,newPwd);
    }

    @Override
    public int createUser(User user) {
        return userMapper.createUser(user);
    }

    @Override
    public List<Map<String, Object>> getAllStrutsUsers() {
        return userMapper.getAllStrutsUsers();
    }

    @Override
    public void updateUserInfoByUserId(User user) {
        userMapper.updateUserInfoByUserId(user);
    }

    @Override
    public List<Role> getAllRoles() {
        return userMapper.getAllRoles();
    }

    @Override
    public int createRole(Role role) {
        return userMapper.createRole(role);
    }

    @Override
    public int updateRole(Role role) {
        return userMapper.updateRole(role);
    }

    @Override
    public int updateRoleStatus(Role role) {
        return userMapper.updateRoleStatus(role);
    }

    @Override
    public List<Integer> getRolesByUserId(int userId) {
        return userMapper.getRolesByUserId(userId);
    }

    @Override
    public int deleteUserAndRolesMappingsByUserId(int userId) {
        return userMapper.deleteUserAndRolesMappingsByUserId(userId);
    }

    @Override
    public int insertUserAndRolesMappings(int userId, int[] roleIds) {
        return userMapper.insertUserAndRolesMappings(userId,roleIds);
    }

    @Override
    public List<Integer> getRolesListByUserId(int userId) {
        return userMapper.getRolesListByUserId(userId);
    }
}