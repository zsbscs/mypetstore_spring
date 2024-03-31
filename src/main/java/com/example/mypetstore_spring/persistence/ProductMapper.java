package com.example.mypetstore_spring.persistence;

import com.example.mypetstore_spring.domain.Product;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductMapper {
    List<Product> getproductListByCategory(String categoryID);

    Product getProduct(String productID);

}
