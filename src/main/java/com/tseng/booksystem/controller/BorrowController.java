package com.tseng.booksystem.controller;

import com.tseng.booksystem.domain.ResponseResult;
import com.tseng.booksystem.domain.entity.Borrow;
import com.tseng.booksystem.service.BorrowService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Date;

@RestController
@RequestMapping("/borrow")
public class BorrowController {

    @Resource
    private BorrowService borrowService;

    // 借阅图书
    @PostMapping("/borrow")
    public ResponseResult<?> addBorrowRecord(@RequestBody Borrow borrow) {
        return borrowService.addBorrowRecord(borrow);
    }

    // 归还图书
    @PutMapping("/return/{id}")
    public ResponseResult<?> addReturnRecord(@PathVariable Integer id, Date today) {
        return borrowService.addReturnRecord(id, today);
    }

    // 续借图书
    @PutMapping("/renew/{id}")
    public ResponseResult<?> addRenewRecord(@PathVariable Integer id, Date renewDate) {
        return borrowService.addRenewRecord(id, renewDate);
    }
}
