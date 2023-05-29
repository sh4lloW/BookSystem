package com.tseng.booksystem;

import com.tseng.booksystem.dao.AdminMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class BookSystemApplicationTests {

    @Autowired
    private AdminMapper adminMapper;

    @Test
    void contextLoads() {
        adminMapper.insertAdmin();
    }

}
