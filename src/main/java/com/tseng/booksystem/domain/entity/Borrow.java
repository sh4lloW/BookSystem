package com.tseng.booksystem.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Borrow {
    private Integer id;
    private Integer readerId;
    private Integer bookId;
    private Date borrowDate;
    private Date dueDate;
    private Date actDueDate;
}
