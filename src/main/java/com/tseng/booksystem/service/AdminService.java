package com.tseng.booksystem.service;

import com.tseng.booksystem.domain.ResponseResult;
import com.tseng.booksystem.domain.entity.Admin;

public interface AdminService {
    ResponseResult<?> addAdmin(Admin admin);

    ResponseResult<?> deleteAdmin(Integer id);

    ResponseResult<?> updateAdmin(Integer id, Admin admin);
}
