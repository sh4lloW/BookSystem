package com.tseng.booksystem.dao;

import com.tseng.booksystem.domain.entity.Admin;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.MappedJdbcTypes;

@Mapper
public interface AdminMapper {
    @Insert("INSERT INTO admin(username, pAssword) VALUES(#{username}, #{password})")
    int insertAdmin(String username, String password);

    @Delete("DELETE FROM admin WHERE username = #{username}")
    int deleteAdmin(String username);

    @Update("UPDATE admin SET username = #{newUsername}, password = #{newPassword} WHERE username = #{username}")
    int updateAdmin(String username, String newUsername, String newPassword);

    // 根据用户名查找管理员
    @Select("SELECT * FROM admin WHERE username = #{username}")
    Admin getAdminByUsername(String username);
}
