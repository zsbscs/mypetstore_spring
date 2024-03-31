package com.example.mypetstore_spring.controller;

import com.example.mypetstore_spring.domain.Item;
import com.example.mypetstore_spring.domain.Product;
import com.example.mypetstore_spring.service.CatalogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/item")
public class ItemController {
    @Autowired
    private CatalogService catalogService;
    @GetMapping("/itemForm")
    public String view(String itemId,Model model){

        Item item=catalogService.getItemBtItemId(itemId);
        String productId=item.getProductId();
        Product product=catalogService.getProduct(productId);
        String description=product.getDescription();
        String[] temp=description.split("\"");
        String img=temp[1];
        String des=temp[2].substring(1);
        model.addAttribute("item",item);
        model.addAttribute("product",product);
        model.addAttribute("img",img);
        model.addAttribute("description",des);




        return "catalog/item";
    }

    @PostMapping("/addItemToCart")
    public String addCart(String itemId){
        return " ";
    }
}
