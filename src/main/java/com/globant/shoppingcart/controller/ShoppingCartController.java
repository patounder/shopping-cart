package com.globant.shoppingcart.controller;

import com.globant.shoppingcart.dto.Cart;
import com.globant.shoppingcart.service.ShoppingCartService;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.LinkedList;

@RestController
@RequestMapping("shopping-cart")
public class ShoppingCartController {

    ShoppingCartService shoppingCartService;

    public ShoppingCartController(ShoppingCartService shoppingCartService) {
        this.shoppingCartService = shoppingCartService;
    }

    @GetMapping(value = "/new", produces = "application/json")
    public Cart getEmptyCart(){
        //TODO define service
        return new Cart("id-session-res", new LinkedList<>());
    }

    @GetMapping(value = "/session-id/{sessionId}", produces = "application/json")
    public Cart getCartWithSesion(@PathVariable String sessionId){
        return shoppingCartService.getCartWith(sessionId);
    }
}
