package com.blog.service;

import com.blog.model.Category;

import java.util.List;

/**
 * Created by 赵禾才 on 2016/11/16.
 */
public interface CategoryService {
    void save(Category category);
    void delete(Long id);
    void update(Category category);
    List<Category > findAll();
    Category findById(Long id);
    Category findByTypeName(String typename);
}
