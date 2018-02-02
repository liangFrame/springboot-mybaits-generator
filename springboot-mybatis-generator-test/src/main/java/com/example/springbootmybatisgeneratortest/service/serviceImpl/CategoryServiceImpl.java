package com.example.springbootmybatisgeneratortest.service.serviceImpl;

import com.example.springbootmybatisgeneratortest.mapper.CategoryMapper;
import com.example.springbootmybatisgeneratortest.pojo.Category;
import com.example.springbootmybatisgeneratortest.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author home-pc
 * @create2018 -02 -02 -12:25
 */
@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    CategoryMapper categoryMapper;

    @Override
    public void add(Category category) {
        categoryMapper.insert(category);
    }

    @Override
    public void delete(int id) {

    }

    @Override
    public void update(Category category) {

    }

    @Override
    public Category get(int id) {
        return categoryMapper.selectByPrimaryKey(id);
    }
}
