package com.globant.shoppingcart.controller;

import com.globant.shoppingcart.messaging.Publisher;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Profile("prod")
@RestController
@RequestMapping("v1")
@Slf4j
public class ShoppingCartPublishController {

    @Autowired
    Publisher publisher;

    @PostMapping(value = "/post-message/{msg}")
    public boolean postMessage(@PathVariable String msg){
        log.info("request post message: {}", msg);
        return publisher.postMessage(msg);
    }
}
