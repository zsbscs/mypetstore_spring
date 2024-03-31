package com.example.mypetstore_spring.controller;

import com.example.mypetstore_spring.domain.Item;
import com.example.mypetstore_spring.domain.Product;
import com.example.mypetstore_spring.service.CatalogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/product")
public class ProductController {
    @Autowired
    private CatalogService catalogService;
        @GetMapping("/productForm")
    public String view(String productId, Model model){
            Product product=catalogService.getProduct(productId);
            List<Item>itemList=catalogService.getItemListByProduct(productId);
            model.addAttribute("product",product);
            model.addAttribute("itemlist",itemList);

            return "catalog/product";
        }

}
