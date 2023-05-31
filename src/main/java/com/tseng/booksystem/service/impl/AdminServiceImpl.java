package com.tseng.booksystem.service.impl;

import com.tseng.booksystem.dao.AdminMapper;
import com.tseng.booksystem.domain.ResponseResult;
import com.tseng.booksystem.domain.entity.Admin;
import com.tseng.booksystem.enums.HttpCodeEnum;
import com.tseng.booksystem.service.AdminService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class AdminServiceImpl implements AdminService {

    @Resource
    AdminMapper adminMapper;

    @Override
    public ResponseResult<?> addAdmin(Admin admin) {

        // 验证用户名是否重合
        Admin existingAdmin = adminMapper.getAdminByUsername(admin.getUsername());
        if (existingAdmin == null) {
            adminMapper.insertAdmin(admin.getUsername(), admin.getPassword());
            return ResponseResult.okResult();
        }else {
            return ResponseResult.errorResult(HttpCodeEnum.USERNAME_EXISTS);
        }
    }
}
