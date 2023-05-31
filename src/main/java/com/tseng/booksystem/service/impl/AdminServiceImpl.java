package com.tseng.booksystem.service.impl;

import com.tseng.booksystem.dao.AdminMapper;
import com.tseng.booksystem.domain.ResponseResult;
import com.tseng.booksystem.domain.entity.Admin;
import com.tseng.booksystem.enums.HttpCodeEnum;
import com.tseng.booksystem.service.AdminService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
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
            // 加密存储
            PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
            String encodePassword = passwordEncoder.encode(admin.getPassword());
            adminMapper.insertAdmin(admin.getUsername(), encodePassword);
            return ResponseResult.okResult();
        }else {
            return ResponseResult.errorResult(HttpCodeEnum.USERNAME_EXISTS);
        }
    }

    @Override
    public ResponseResult<?> deleteAdmin(Integer id) {
        adminMapper.deleteAdmin(id);
        return ResponseResult.okResult();
    }

    @Override
    public ResponseResult<?> updateAdmin(Integer id, Admin admin) {
        PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        String encodePassword = passwordEncoder.encode(admin.getPassword());
        adminMapper.updateAdmin(id, admin.getUsername(), encodePassword);
        return ResponseResult.okResult();
    }


}
