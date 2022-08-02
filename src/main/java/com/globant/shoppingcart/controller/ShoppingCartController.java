package com.globant.shoppingcart.controller;

import com.globant.shoppingcart.dto.Cart;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("shopping-cart")
public class ShoppingCartController {

    @GetMapping(value = "/new", produces = "application/json")
    public Cart getEmptyCart(){
        //TODO define service
        return new Cart("id-session-res");
    }
}
