package com.example.mypetstore_spring.service;

import com.example.mypetstore_spring.domain.Category;
import com.example.mypetstore_spring.persistence.CategoryMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CatalogService {
    @Autowired
    private CategoryMapper categoryMapper;

    public Category getCategory(String categoryId){
        return categoryMapper.getCategory(categoryId);
    }
}
