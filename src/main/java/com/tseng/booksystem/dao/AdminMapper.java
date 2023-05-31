package com.tseng.booksystem.dao;

import com.tseng.booksystem.domain.entity.Admin;
import org.apache.ibatis.annotations.*;

@Mapper
public interface AdminMapper {
    @Insert("INSERT INTO admin(username, pAssword) VALUES(#{username, jdbcType=VARCHAR}, #{password, jdbcType=VARCHAR})")
    int insertAdmin(String username, String password);

    @Delete("DELETE FROM admin WHERE id = #{id}")
    int deleteAdmin(Integer id);

    @Update("UPDATE admin SET username = #{newUsername, jdbcType=VARCHAR}, password = #{newPassword, jdbcType=VARCHAR} WHERE id = #{id}")
    int updateAdmin(Integer id, String newUsername, String newPassword);

    // 根据用户名查找管理员
    @Select("SELECT * FROM admin WHERE username = #{username, jdbcType=VARCHAR}")
    Admin getAdminByUsername(String username);
}
