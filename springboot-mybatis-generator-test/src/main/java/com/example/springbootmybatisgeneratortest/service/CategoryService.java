package com.example.springbootmybatisgeneratortest.service;

import com.example.springbootmybatisgeneratortest.pojo.Category;

public interface CategoryService {

    void add(Category category);

    void delete(int id);

    void update(Category category);

    Category get(int id);

}
