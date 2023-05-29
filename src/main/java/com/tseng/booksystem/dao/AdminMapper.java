package com.tseng.booksystem.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AdminMapper {
    @Insert("INSERT INTO admin(username, pAssword) VALUES('test', '123456')")
    int insertAdmin();
}
