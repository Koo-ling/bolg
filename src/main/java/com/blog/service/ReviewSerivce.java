package com.blog.service;

import com.blog.model.Review;

import java.util.List;

/**
 * Created by 赵禾才 on 2016/11/16.
 */
public interface ReviewSerivce {
    void save(Review review);

    void delete(Long id);

    Review update(Review review);

    Review findById(Long id);

    List<Review> findAll();

    List<Review> findByUserId(Long id);

    List<Review> findByArticleId(Long id);

    List<Review> findByReviewId(Long id);
}
