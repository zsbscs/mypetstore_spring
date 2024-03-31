package com.example.mypetstore_spring.service;

import com.example.mypetstore_spring.domain.Category;
import com.example.mypetstore_spring.domain.Item;
import com.example.mypetstore_spring.domain.Product;
import com.example.mypetstore_spring.persistence.CategoryMapper;
import com.example.mypetstore_spring.persistence.ItemMapper;
import com.example.mypetstore_spring.persistence.ProductMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CatalogService {
    @Autowired
    private CategoryMapper categoryMapper;
    @Autowired
    private ProductMapper productMapper;
    @Autowired
    private ItemMapper itemMapper;

    public Category getCategory(String categoryId){
        return categoryMapper.getCategory(categoryId);
    }

    public List<Product>getProductList(String categoryID){
        return productMapper.getproductListByCategory(categoryID);
    }

    public Product getProduct(String productId) {
        return productMapper.getProduct(productId);
    }
    public List<Item> getItemListByProduct(String productId) {return itemMapper.getItemListByProduct(productId);}

    public Item getItemBtItemId(String itemId){return itemMapper.getItemByItemId(itemId);}

}
