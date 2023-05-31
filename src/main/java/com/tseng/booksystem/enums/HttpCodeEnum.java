package com.tseng.booksystem.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum HttpCodeEnum {
    SUCCESS(200, "成功"),
    NEED_LOGIN(401, "需要登录"),
    NO_OPERATOR_AUTH(403, "无权限操作"),
    SYSTEM_ERROR(500, "出现错误"),

    USERNAME_EXISTS(501, "用户名已存在");

    int code;
    String msg;
}
