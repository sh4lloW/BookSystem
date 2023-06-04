package com.tseng.booksystem.service;

import com.tseng.booksystem.domain.ResponseResult;
import com.tseng.booksystem.domain.entity.Borrow;

import java.util.Date;

public interface BorrowService {
    ResponseResult<?> addBorrowRecord(Borrow borrow);

    ResponseResult<?> addReturnRecord(Integer id, Date today);

    ResponseResult<?> addRenewRecord(Integer id, Date renewDate);
}
