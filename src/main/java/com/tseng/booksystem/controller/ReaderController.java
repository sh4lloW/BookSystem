package com.tseng.booksystem.controller;

import com.tseng.booksystem.domain.ResponseResult;
import com.tseng.booksystem.domain.entity.Reader;
import com.tseng.booksystem.domain.entity.ReaderType;
import com.tseng.booksystem.service.ReaderService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("/reader")
public class ReaderController {

    @Resource
    private ReaderService readerService;

    // 增加读者
    @PostMapping("/add")
    public ResponseResult<?> addReader(@RequestBody Reader reader) {
        return readerService.addReader(reader);
    }

    // 删除读者
    @DeleteMapping("/delete/{id}")
    public ResponseResult<?> deleteReader(@PathVariable Integer id) {
        return readerService.deleteReader(id);
    }

    // 更新读者信息
    @PutMapping("/update/{id}")
    public ResponseResult<?> updateReader(@PathVariable Integer id, @RequestBody Reader reader) {
        return readerService.updateReader(id, reader);
    }

    // 根据id查询读者
    @GetMapping("/searchById/{id}")
    public ResponseResult<?> searchReaderById(@PathVariable Integer id) {
        return readerService.searchReaderById(id);
    }


    // 读者类型CRUD
    @PostMapping("/type/add")
    public ResponseResult<?> addReaderType(@RequestBody ReaderType readerType) {
        return readerService.addReaderType(readerType);
    }

    @DeleteMapping("/type/delete/{id}")
    public ResponseResult<?> deleteReaderType(@PathVariable Integer id) {
        return readerService.deleteReaderType(id);
    }

    @PutMapping("/type/update/{id}")
    public ResponseResult<?> updateReaderType(@PathVariable Integer id, @RequestBody ReaderType readerType) {
        return readerService.updateReaderType(id, readerType);
    }

    @GetMapping("/type/searchById/{id}")
    public ResponseResult<?> searchReaderTypeById(@PathVariable Integer id) {
        return readerService.searchReaderTypeById(id);
    }

}
