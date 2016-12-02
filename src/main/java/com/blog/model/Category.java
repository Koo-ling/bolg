package com.blog.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 赵禾才 on 2016/11/16.
 */
@Entity
public class Category {

    @Id
    private Long id;
    @Column(name = "type_name")
    private String typeName;



    public Category() {
    }

    public Category(Long id, String typeName) {
        this.id = id;
        this.typeName = typeName;
    }




    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }


}
