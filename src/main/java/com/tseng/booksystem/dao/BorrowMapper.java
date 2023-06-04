package com.tseng.booksystem.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Update;

import java.util.Date;

@Mapper
public interface BorrowMapper {
    @Insert("INSERT INTO borrow(reader_id, book_id, borrow_date, due_date, act_due_date) VALUES(#{readId}, #{bookId}, #{borrowDate}, #{dueDate}, #{actDueDate})")
    int insertBorrowRecord(Integer readerId, Integer bookId, Date borrowDate, Date dueDate, Date actDueDate);

    @Update("UPDATE borrow SET act_due_date = #{actDueDate} WHERE id = #{id}")
    int insertReturnRecord(Integer id, Date actDueDate);

    @Update("UPDATE borrow SET due_date = #{dueDate} WHERE id = #{id}")
    int insertRenewRecord(Integer id, Date dueDate);
}
