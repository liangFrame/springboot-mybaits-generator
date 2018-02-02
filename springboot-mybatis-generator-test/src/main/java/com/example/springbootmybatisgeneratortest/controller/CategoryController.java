package com.example.springbootmybatisgeneratortest.controller;

import com.example.springbootmybatisgeneratortest.pojo.Category;
import com.example.springbootmybatisgeneratortest.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author home-pc
 * @create2018 -02 -02 -14:40
 */
@RestController
public class CategoryController {

    @Autowired
    CategoryService categoryService;

    @GetMapping(value = "/category/{id}")
    public Category getCategory(@PathVariable("id") Integer id){
        return categoryService.get(id);
        }
}
