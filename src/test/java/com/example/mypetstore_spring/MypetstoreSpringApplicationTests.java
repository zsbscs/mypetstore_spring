package com.example.mypetstore_spring;

import com.example.mypetstore_spring.domain.Category;
import com.example.mypetstore_spring.domain.Item;
import com.example.mypetstore_spring.domain.Product;
import com.example.mypetstore_spring.service.CatalogService;
import org.junit.jupiter.api.Test;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

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


  /*@Test
    void testProduct(){
       Product product= catalogService.getProduct("AV-SB-02");
       System.out.println(product.getCategoryId());

    }*/


    /*@Test
    void testItem(){
        List<Item>itemList=catalogService.getItemListByProduct("K9-RT-02");
        System.out.println(itemList.size());
    }*/


}
