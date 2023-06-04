package com.tseng.booksystem.controller;

import com.tseng.booksystem.domain.ResponseResult;
import com.tseng.booksystem.domain.entity.Rule;
import com.tseng.booksystem.service.RuleService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("/rule")
public class RuleController {

    @Resource
    private RuleService ruleService;

    @PostMapping("/add")
    public ResponseResult<?> addRule(@RequestBody Rule rule) {
        return ruleService.addRule(rule);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseResult<?> deleteRule(@PathVariable Integer id) {
        return ruleService.deleteRule(id);
    }

    @PutMapping("/update/{id}")
    public ResponseResult<?> updateRule(@PathVariable Integer id, @RequestBody Rule rule) {
        return ruleService.updateRule(id, rule);
    }

    @GetMapping("/searchById/{id}")
    public ResponseResult<?> searchRuleById(@PathVariable Integer id) {
        return ruleService.searchRuleById(id);
    }
}
