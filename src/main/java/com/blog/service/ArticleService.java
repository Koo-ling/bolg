package com.blog.service;

import com.blog.model.Article;

import java.util.List;

/**
 * Created by 赵禾才 on 2016/11/16.
 */
public interface ArticleService {
    void save(Article article);
    void delete(Long id);
    void update(Article article);
    List<Article> findAll();
    List<Article> findByTitle(String title);
    Article findById(Long id);
    List<Article> findByReadNumber();
    List<Article> findByUserId(Long id);
    List<Article> findByTypeId(Long id);


}
