package com.mashibing.springboot.service;

import com.github.pagehelper.PageInfo;
import com.mashibing.springboot.entity.Permission;

import java.util.List;

public interface IPermissionService {

    PageInfo<Permission> findByPage(int pageNum, int pageSize);

    Permission findById(int id);

    void update(Permission permission);

    void add(Permission permission);

    List<Permission> findAll();

}