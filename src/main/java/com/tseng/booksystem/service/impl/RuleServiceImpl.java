package com.tseng.booksystem.service.impl;

import com.tseng.booksystem.dao.RuleMapper;
import com.tseng.booksystem.domain.ResponseResult;
import com.tseng.booksystem.domain.entity.Rule;
import com.tseng.booksystem.service.RuleService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class RuleServiceImpl implements RuleService {

    @Resource
    RuleMapper ruleMapper;

    @Override
    public ResponseResult<?> addRule(Rule rule) {
        ruleMapper.insertRule(rule.getReaderType(), rule.getBookType(), rule.getDays(), rule.getNum(), rule.getRenew());
        return ResponseResult.okResult();
    }

    @Override
    public ResponseResult<?> deleteRule(Integer id) {
        ruleMapper.deleteRule(id);
        return ResponseResult.okResult();
    }

    @Override
    public ResponseResult<?> updateRule(Integer id, Rule rule) {
        ruleMapper.updateRule(id, rule.getReaderType(), rule.getBookType(), rule.getDays(), rule.getNum(), rule.getRenew());
        return ResponseResult.okResult();
    }

    @Override
    public ResponseResult<?> searchRuleById(Integer id) {
        Rule rule = ruleMapper.searchRuleById(id);
        return ResponseResult.okResult(rule);
    }
}
