package com.tseng.booksystem.dao;

import com.tseng.booksystem.domain.entity.Reader;
import com.tseng.booksystem.domain.entity.ReaderType;
import org.apache.ibatis.annotations.*;

@Mapper
public interface ReaderMapper {
    // 读者CRUD
    @Insert("INSERT INTO reader(name, telephone, email, type) VALUES(#{name, jdbcType=VARCHAR}, #{telephone, jdbcType=VARCHAR}, #{email, jdbcType=VARCHAR}, #{type})")
    int insertReader(String name, String telephone, String email, Integer type);

    @Delete("DELETE FROM reader WHERE id = #{id}")
    int deleteReader(Integer id);

    @Update("UPDATE reader SET name = #{name, jdbcType=VARCHAR}, telephone = #{telephone, jdbcType=VARCHAR}, email = #{email, jdbcType=VARCHAR}, type = #{type} WHERE id = #{id}")
    int  updateReader(Integer id, String name, String telephone, String email, Integer type);

    @Select("SELECT * FROM reader WHERE id = #{id}")
    Reader selectReaderById(Integer id);

    // 读者类型CRUD
    @Insert("INSERT INTO reader_type(name), VALUES(#{name, jdbcType=VARCHAR})")
    int insertReaderType(String name);

    @Delete("DELETE FROM reader_type WHERE id = #{id}")
    int deleteReaderType(Integer id);

    @Update("UPDATE reader_type SET name = #{name, jdbcType=VARCHAR} WHERE id = #{id}")
    int updateReaderType(Integer id, String name);

    @Select("SELECT * FROM reader_type WHERE id = #{id}")
    ReaderType selectReaderTypeById(Integer id);
}
