package com.tseng.booksystem.dao;

import com.tseng.booksystem.domain.entity.Rule;
import org.apache.ibatis.annotations.*;

@Mapper
public interface RuleMapper {
    @Insert("INSERT INTO rule(reader_type, book_type, days, num, renew) VALUES(#{readerType}, #{bookType}, #{days}, #{num}, #{renew})")
    int insertRule(Integer readerType, Integer bookType, Integer days, Integer num, Integer renew);

    @Delete("DELETE FROM rule WHERE id = #{id}")
    int deleteRule(Integer id);

    @Update("UPDATE rule SET reader_type = #{readerType}, book_type = #{bookType}, days = #{days}, num = #{num}, renew = #{renew} WHERE id = #{id}")
    int updateRule(Integer id, Integer readerType, Integer bookType, Integer days, Integer num, Integer renew);

    @Select("SELECT * FROM rule WHERE id = #{id}")
    Rule searchRuleById(Integer id);
}
