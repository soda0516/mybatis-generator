package com.example.mybatisgenerator.dao;

import com.example.mybatisgenerator.pojo.SysPermissonRole;

public interface SysPermissonRoleMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SysPermissonRole record);

    int insertSelective(SysPermissonRole record);

    SysPermissonRole selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SysPermissonRole record);

    int updateByPrimaryKey(SysPermissonRole record);
}