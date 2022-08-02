package com.globant.shoppingcart.dto;

public class Cart {

    private String sesionId;

    public Cart(String sesionId) {
        super();
        this.sesionId = sesionId;
    }

    public String getSesionId() {
        return sesionId;
    }

    public void setSesionId(String sesionId) {
        this.sesionId = sesionId;
    }
}
