package com.likelion12th.shop.Dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor

//장바구니 상품 정보
public class CartDetailDto {
    private Long cartItemId;
    private String itemName;
    private int itemPrice;
    private int count;
    private String itemImgPath;

    public CartDetailDto(Long cartItemId, String itemName, int itemPrice, int count, String itemImgPath){
        this.cartItemId = cartItemId;
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.count = count;
        this.itemImgPath = itemImgPath;
    }
}
