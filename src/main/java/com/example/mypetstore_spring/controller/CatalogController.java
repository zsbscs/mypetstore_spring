package com.example.mypetstore_spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/catalog")
public class CatalogController {
    @GetMapping("/view")
    public String view(){
        return "catalog/main";
    }

}
