package com.globant.shoppingcart.controller;

import com.globant.shoppingcart.dto.Cart;
import com.globant.shoppingcart.dto.Status;
import com.globant.shoppingcart.service.ShoppingCartService;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

@RestController
@RequestMapping("v1")
public class ShoppingCartController {

    ShoppingCartService shoppingCartService;

    public ShoppingCartController(ShoppingCartService shoppingCartService) {
        this.shoppingCartService = shoppingCartService;
    }

    @GetMapping(value = "/shopping-cart/new", produces = "application/json")
    public Cart getEmptyCart(){
        return new Cart("id-session-res", new LinkedList<>(), LocalDateTime.now(), LocalDateTime.now(), Status.INACTIVE);
    }

    @GetMapping(value = "/shopping-cart/session-id/{sessionId}", produces = "application/json")
    public Cart getCartWithSession(@PathVariable String sessionId){
        return shoppingCartService.getCartWithSessionId(sessionId);
    }

    @GetMapping(value = "/shopping-cart", produces = "application/json")
    public List<Cart> getCarts(){
        return new ArrayList<>();
    }

    //Create services
    @PostMapping(value = "/shopping-cart")
    public Cart newCart(@RequestBody Cart updateCart){
        return shoppingCartService.save(updateCart);
    }

}
