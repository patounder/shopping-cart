package com.globant.shoppingcart.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

@Controller(value = "/shopping")
public class ShoppingCartController {

    @PostMapping()
    public void createShoppingCart(String sessionId){
        //TODO define DTO response
        //TODO define service

    }
}
