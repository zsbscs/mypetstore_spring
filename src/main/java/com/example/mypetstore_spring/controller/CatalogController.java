package com.example.mypetstore_spring.controller;

import com.example.mypetstore_spring.domain.Category;
import com.example.mypetstore_spring.domain.Product;
import com.example.mypetstore_spring.service.CatalogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/catalog")
public class CatalogController {
    @Autowired
    private CatalogService catalogService;


    @GetMapping("/view")
    public String view(){
        return "catalog/main";
    }
    @GetMapping("/categoryForm")
    public String viewcategory(String categoryID, Model model) {
        if (!categoryID.equals("")) {
            List<Product> productList=catalogService.getProductList(categoryID);
            Category category=catalogService.getCategory(categoryID);
            model.addAttribute("productlist",productList);
            model.addAttribute("category",category);
            return "catalog/category";
        }
        return "catalog/main";
    }
}
