package com.tseng.booksystem.controller;

import com.tseng.booksystem.domain.ResponseResult;
import com.tseng.booksystem.domain.entity.Admin;
import com.tseng.booksystem.service.AdminService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/admin")
public class AdminController {

    @Resource
    private AdminService adminService;

    // 增加管理员
    @GetMapping("/add")
    public ResponseResult<?> addAdmin(Admin admin) {
        return adminService.addAdmin(admin);
    }
}
