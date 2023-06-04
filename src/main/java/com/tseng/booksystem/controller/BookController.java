package com.tseng.booksystem.controller;

import com.tseng.booksystem.domain.ResponseResult;
import com.tseng.booksystem.domain.entity.Book;
import com.tseng.booksystem.domain.entity.BookType;
import com.tseng.booksystem.service.BookService;
import org.apache.ibatis.annotations.Select;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("/book")
public class BookController {

    @Resource
    private BookService bookService;

    // 增加图书
    @PostMapping("/add")
    public ResponseResult<?> addBook(@RequestBody Book book) {
        return bookService.addBook(book);
    }

    // 删除图书
    @DeleteMapping("/delete/{id}")
    public ResponseResult<?> deleteBook(@PathVariable Integer id) {
        return bookService.deleteBook(id);
    }

    // 更新图书信息
    @PutMapping("/update/{id}")
    public ResponseResult<?> updateBook(@PathVariable Integer id, @RequestBody Book book) {
        return bookService.updateBook(id, book);
    }

    // 根据图书名查找图书
    @GetMapping("/searchByName")
    public ResponseResult<?> searchBookByName(@RequestParam String name) {
        return bookService.searchByName(name);
    }

    @GetMapping("/searchByIsbn")
    public ResponseResult<?> searchBookByIsbn(@RequestParam String isbn) {
        return bookService.searchByIsbn(isbn);
    }


    // 图书类型表CRUD
    @PostMapping("/type/add")
    public ResponseResult<?> addBookType(@RequestBody BookType bookType) {
        return bookService.addBookType(bookType);
    }

    @DeleteMapping("/type/delete/{id}")
    public ResponseResult<?> deleteBookType(@PathVariable Integer id) {
        return bookService.deleteBookType(id);
    }

    @PutMapping("/type/update/{id}")
    public ResponseResult<?> updateBookType(@PathVariable Integer id, @RequestBody BookType bookType) {
        return bookService.updateBookType(id, bookType);
    }

    @GetMapping("/type/searchById/{id}")
    public ResponseResult<?> searchBookTypeById(@PathVariable Integer id) {
        return bookService.searchBookTypeById(id);
    }

}
