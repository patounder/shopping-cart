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
@RequestMapping("shopping-cart")
public class ShoppingCartController {

    ShoppingCartService shoppingCartService;

    public ShoppingCartController(ShoppingCartService shoppingCartService) {
        this.shoppingCartService = shoppingCartService;
    }

    @GetMapping(value = "/new", produces = "application/json")
    public Cart getEmptyCart(){
        return new Cart("id-session-res", new LinkedList<>(), LocalDateTime.now(), LocalDateTime.now(), Status.INACTIVE);
    }

    @GetMapping(value = "/session-id/{sessionId}", produces = "application/json")
    public Cart getCartWithSession(@PathVariable String sessionId){
        return shoppingCartService.getCartWith(sessionId);
    }

    @GetMapping(value = "/sessions/all", produces = "application/json")
    public List<Cart> getAllCarts(){
        return new ArrayList<>();
    }

    //Create services
    public Cart updateCart(Cart updateCart){
        return shoppingCartService.save(updateCart);
    }


}
