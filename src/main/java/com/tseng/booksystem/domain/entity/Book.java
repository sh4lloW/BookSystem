package com.tseng.booksystem.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Book {
    private Integer id;
    private String name;
    private String author1;
    private String author2;
    private String author3;
    private String isbn;
    private String publish;
    private Date publishDate;
    private Integer price;
    private String img;
    private String summary;
    private Integer type;
}
