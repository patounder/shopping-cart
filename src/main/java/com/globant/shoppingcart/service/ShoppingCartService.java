package com.globant.shoppingcart.service;

import com.globant.shoppingcart.dto.CartDTO;
import com.globant.shoppingcart.model.Cart;
import com.globant.shoppingcart.model.Item;
import com.globant.shoppingcart.model.ItemOrder;
import com.globant.shoppingcart.repository.CartRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ShoppingCartService {

    CartRepository cartRepository;

    public ShoppingCartService(CartRepository cartRepository) {
        this.cartRepository = cartRepository;
    }

    public CartDTO getCartWithSessionId(String sessionId){

        CartDTO initCartDTO = CartDTO.builder()
                .sessionId(sessionId)
                .orderDetailList(null)
                .orderDate(null)
                .build();

        return initCartDTO;
    }

    public CartDTO save(CartDTO updateCartDTO){

        List<ItemOrder> itemOrderList = updateCartDTO.getOrderDetailList()
                .stream().map(orderDetailDTO -> {
                    Item item = Item.builder()
                            .sku(orderDetailDTO.getItem().getSku())
                            .name(orderDetailDTO.getItem().getName())
                            .price(orderDetailDTO.getItem().getSalePrice())
                            .build();
                    return ItemOrder.builder().quantity(orderDetailDTO.getQuantity()).item(item).build();
                }).collect(Collectors.toList());

        Cart entity = new Cart(updateCartDTO.getSessionId(), LocalDateTime.now(), itemOrderList);
        Cart response = cartRepository.save(entity);

        return CartDTO.builder()
                .sessionId(response.getSessionId())
                .orderDate(response.getOrderDate())
                .orderDetailList(null).status(null).build();
    }

    public List<CartDTO> getAllCarts(){
        List<Cart> cartList = (List<Cart>) this.cartRepository.findAll();

        List<CartDTO> cartListResponse =
        cartList.stream().map(cart -> {
            return CartDTO.builder()
                    .sessionId(cart.getSessionId())
                    .orderDate(cart.getOrderDate())
                    .build();
        }).collect(Collectors.toList());

        return cartListResponse;
    }
}
