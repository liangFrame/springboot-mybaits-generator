package com.example.springbootmybatisgeneratortest.service.serviceImpl;

import com.example.springbootmybatisgeneratortest.pojo.Category;
import com.example.springbootmybatisgeneratortest.service.CategoryService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
public class CategoryServiceImplTest {

    @Autowired
    CategoryService categoryService;

    @Test
    public void add() {
        Category category=new Category();
        category.setName("测试");
        categoryService.add(category);
    }

    @Test
    public void get() {
        System.out.println(categoryService.get(1));
    }
}