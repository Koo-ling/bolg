package com.blog.repository;

import com.blog.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


import java.util.List;

/**
 * Created by wang0 on 2016/11/16.
 */

public interface UserRepository  extends JpaRepository<User,Long>{
    User findById(Long id);
    User findByName(String name);

}
