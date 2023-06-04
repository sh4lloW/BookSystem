package com.tseng.booksystem.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Rule {
    private Integer id;
    private Integer readerType;
    private Integer bookType;
    private Integer days;
    private Integer num;
    private Integer renew;
}
