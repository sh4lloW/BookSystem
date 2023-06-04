package com.tseng.booksystem.service;

import com.tseng.booksystem.domain.ResponseResult;
import com.tseng.booksystem.domain.entity.Book;
import com.tseng.booksystem.domain.entity.BookType;

public interface BookService {
    ResponseResult<?> addBook(Book book);

    ResponseResult<?> deleteBook(Integer id);

    ResponseResult<?> updateBook(Integer id, Book book);

    ResponseResult<?> searchByName(String name);

    ResponseResult<?> searchByIsbn(String isbn);

    ResponseResult<?> addBookType(BookType bookType);

    ResponseResult<?> deleteBookType(Integer id);

    ResponseResult<?> updateBookType(Integer id, BookType bookType);

    ResponseResult<?> searchBookTypeById(Integer id);
}
