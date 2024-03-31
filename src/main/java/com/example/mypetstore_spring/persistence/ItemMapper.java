package com.example.mypetstore_spring.persistence;

import com.example.mypetstore_spring.domain.Item;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ItemMapper {
    List<Item> getItemListByProduct(String productId);
    Item getItemByItemId(String itemId);
}
