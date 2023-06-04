package com.tseng.booksystem.dao;

import com.tseng.booksystem.domain.entity.Book;
import com.tseng.booksystem.domain.entity.BookType;
import org.apache.ibatis.annotations.*;

import java.util.Date;

@Mapper
public interface BookMapper {

    @Insert("INSERT INTO book(name, author1, author2, author3, isbn, publish, publishDate, price, img, summary, type) " +
            "VALUES(#{name, jdbcType=VARCHAR}, #{author1, jdbcType=VARCHAR}, #{author2, jdbcType=VARCHAR}, #{author3, jdbcType=VARCHAR}, " +
            "#{isbn, jdbcType=VARCHAR}, #{publish, jdbcType=VARCHAR}, #{publishDate}, #{price}, #{img, jdbcType=VARCHAR}, " +
            "#{summary, jdbcType=VARCHAR}, #{type})")
    int insertBook(String name, String author1, String author2, String author3, String isbn, String publish, Date publishDate, Integer price, String img, String summary, Integer type);

    @Delete("DELETE FROM book WHERE id = #{id}")
    int deleteBook(Integer id);

    @Update("UPDATE book SET name = #{name, jdbcType=VARCHAR}, author1 = #{author1, jdbcType=VARCHAR}, author2 = #{author2, jdbcType=VARCHAR}, " +
    "author3 = #{author3, jdbcType=VARCHAR}, isbn = #{isbn, jdbcType=VARCHAR}, publish = #{publish, jdbcType=VARCHAR}, publishDate = #{publishDate}, " +
    "price = #{price}, img = #{img, jdbcType=VARCHAR}, summary = #{summary, jdbcType=VARCHAR}, type = #{type}" +
    "WHERE id = #{id}")
    int updateBook(Integer id, String name, String author1, String author2, String author3, String isbn, String publish, Date publishDate, Integer price, String img, String summary, Integer type);

    //根据名字模糊查找
    @Select("SELECT * FROM book WHERE name LIKE CONCAT(CONCAT('%', #{name}), '%')")
    Book selectBookByName(String name);

    // 根据ISBN号查书
    @Select("SELECT * FROM book WHERE isbn = #{isbn}")
    Book selectBookByIsbn(String isbn);


    // 图书类型CRUD
    @Insert("INSERT INTO book_type(name) VALUES (#{name, jdbcType=VARCHAR})")
    int insertBookType(String name);

    @Delete("DELETE FROM book_type WHERE id = #{id}")
    int deleteBookType(Integer id);

    @Update("UPDATE book_type SET name = #{name} WHERE id = #{id}")
    int updateBookType(Integer id, String name);

    @Select("SELECT * FROM book_type WHERE id = #{id}")
    BookType searchBookTypeById(Integer id);

}
