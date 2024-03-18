package com.example.mypetstore_spring;

import com.example.mypetstore_spring.domain.Category;
import com.example.mypetstore_spring.service.CatalogService;
import org.junit.jupiter.api.Test;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@MapperScan("com.example.mypetstore_spring.persistence")
class MypetstoreSpringApplicationTests {
    @Autowired
    CatalogService catalogService;

    @Test
    void contextLoads() {
    }

   /* @Test
    void testCategory(){
        Category c=catalogService.getCategory("CATS");
        System.out.println(c.getCategoryId()+","+c.getName()+","+c.getDescription());
    }*/


}
