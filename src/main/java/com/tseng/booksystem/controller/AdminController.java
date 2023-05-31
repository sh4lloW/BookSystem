package com.tseng.booksystem.controller;

import com.tseng.booksystem.domain.ResponseResult;
import com.tseng.booksystem.domain.entity.Admin;
import com.tseng.booksystem.service.AdminService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("/admin")
public class AdminController {

    @Resource
    private AdminService adminService;

    // 增加管理员
    @PostMapping("/add")
    public ResponseResult<?> addAdmin(@RequestBody Admin admin) {
        return adminService.addAdmin(admin);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseResult<?> deleteAdmin(@PathVariable Integer id) {
        return adminService.deleteAdmin(id);
    }

    // 更新管理员信息
    @PutMapping("/update/{id}")
    public ResponseResult<?> updateAdmin(@PathVariable Integer id, @RequestBody Admin admin) {
        return adminService.updateAdmin(id, admin);
    }
}
