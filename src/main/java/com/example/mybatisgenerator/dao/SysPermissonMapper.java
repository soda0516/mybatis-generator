package com.example.mybatisgenerator.dao;

import com.example.mybatisgenerator.pojo.SysPermisson;

public interface SysPermissonMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SysPermisson record);

    int insertSelective(SysPermisson record);

    SysPermisson selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SysPermisson record);

    int updateByPrimaryKey(SysPermisson record);
}