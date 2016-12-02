package com.blog.repository;


import com.blog.model.TemporaryArticle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;


/**
 * Created by 赵禾才 on 2016/11/16.
 */

public interface TemporaryArticleRepository  extends JpaRepository<TemporaryArticle,Long>{
    TemporaryArticle findById(Long id);
    @Query("select t from  TemporaryArticle t  where user_Id= ?1")
    List<TemporaryArticle> findByUserId(Long id);
}
