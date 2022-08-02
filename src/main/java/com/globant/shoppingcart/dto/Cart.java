package com.globant.shoppingcart.dto;

public class Cart {

    private String sessionId;

    public Cart(String sessionId) {
        super();
        this.sessionId = sessionId;
    }

    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }
}
