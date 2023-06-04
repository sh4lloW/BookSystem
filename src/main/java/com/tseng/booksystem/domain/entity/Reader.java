package com.tseng.booksystem.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Reader {
    private Integer id;
    private String name;
    private String telephone;
    private String email;
    private Integer type;
}
