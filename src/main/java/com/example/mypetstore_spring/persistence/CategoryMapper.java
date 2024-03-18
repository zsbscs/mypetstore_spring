package com.example.mypetstore_spring.persistence;

import com.example.mypetstore_spring.domain.Category;

import org.springframework.stereotype.Repository;

@Repository

public interface CategoryMapper {
    Category getCategory(String categoryId);

}
