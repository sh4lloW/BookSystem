package com.tseng.booksystem.service.impl;

import com.tseng.booksystem.dao.BorrowMapper;
import com.tseng.booksystem.domain.ResponseResult;
import com.tseng.booksystem.domain.entity.Borrow;
import com.tseng.booksystem.service.BorrowService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;

@Service
public class BorrowServiceImpl implements BorrowService {

    @Resource
    BorrowMapper borrowMapper;

    @Override
    public ResponseResult<?> addBorrowRecord(Borrow borrow) {
        borrowMapper.insertBorrowRecord(borrow.getReaderId(), borrow.getBookId(), borrow.getBorrowDate(), borrow.getDueDate(), borrow.getActDueDate());
        return ResponseResult.okResult();
    }

    @Override
    public ResponseResult<?> addReturnRecord(Integer id, Date today) {
        borrowMapper.insertReturnRecord(id, today);
        return ResponseResult.okResult();
    }

    @Override
    public ResponseResult<?> addRenewRecord(Integer id, Date renewDate) {
        borrowMapper.insertRenewRecord(id, renewDate);
        return ResponseResult.okResult();
    }

}
