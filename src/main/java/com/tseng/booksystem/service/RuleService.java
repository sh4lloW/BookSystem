package com.tseng.booksystem.service;

import com.tseng.booksystem.domain.ResponseResult;
import com.tseng.booksystem.domain.entity.Rule;

public interface RuleService {
    ResponseResult<?> addRule(Rule rule);

    ResponseResult<?> deleteRule(Integer id);

    ResponseResult<?> updateRule(Integer id, Rule rule);

    ResponseResult<?> searchRuleById(Integer id);
}
