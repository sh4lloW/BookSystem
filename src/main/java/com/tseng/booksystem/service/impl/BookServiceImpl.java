package com.tseng.booksystem.service.impl;

import com.tseng.booksystem.dao.BookMapper;
import com.tseng.booksystem.domain.ResponseResult;
import com.tseng.booksystem.domain.entity.Book;
import com.tseng.booksystem.domain.entity.BookType;
import com.tseng.booksystem.service.BookService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class BookServiceImpl implements BookService {

    @Resource
    BookMapper bookMapper;

    @Override
    public ResponseResult<?> addBook(Book book) {
        bookMapper.insertBook(book.getName(), book.getAuthor1(), book.getAuthor2(), book.getAuthor3(), book.getIsbn(), book.getPublish(), book.getPublishDate(), book.getPrice(), book.getImg(), book.getSummary(), book.getType());
        return ResponseResult.okResult();
    }

    @Override
    public ResponseResult<?> deleteBook(Integer id) {
        bookMapper.deleteBook(id);
        return ResponseResult.okResult();
    }

    @Override
    public ResponseResult<?> updateBook(Integer id, Book book) {
        bookMapper.updateBook(id, book.getName(), book.getAuthor1(), book.getAuthor2(), book.getAuthor3(), book.getIsbn(), book.getPublish(), book.getPublishDate(), book.getPrice(), book.getImg(), book.getSummary(), book.getType());
        return ResponseResult.okResult();
    }

    @Override
    public ResponseResult<?> searchByName(String name) {
        Book book = bookMapper.selectBookByName(name);
        return ResponseResult.okResult(book);
    }

    @Override
    public ResponseResult<?> searchByIsbn(String isbn) {
        Book book = bookMapper.selectBookByIsbn(isbn);
        return ResponseResult.okResult(book);
    }

    @Override
    public ResponseResult<?> addBookType(BookType bookType) {
        bookMapper.insertBookType(bookType.getName());
        return ResponseResult.okResult();
    }

    @Override
    public ResponseResult<?> deleteBookType(Integer id) {
        bookMapper.deleteBookType(id);
        return ResponseResult.okResult();
    }

    @Override
    public ResponseResult<?> updateBookType(Integer id, BookType bookType) {
        bookMapper.updateBookType(id, bookType.getName());
        return ResponseResult.okResult();
    }

    @Override
    public ResponseResult<?> searchBookTypeById(Integer id) {
        BookType bookType = bookMapper.searchBookTypeById(id);
        return ResponseResult.okResult(bookType);
    }
}
