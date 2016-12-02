package com.blog.repository;

import com.blog.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;


/**
 * Created by 赵禾才 on 2016/11/16.
 */

public interface CategoryRepository extends JpaRepository<Category,Long> {
    Category findById(Long id);
    Category findByTypeName(String typename);
}
