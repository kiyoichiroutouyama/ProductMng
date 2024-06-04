package com.example.productmng;

import lombok.Data;

@Data
public class productmngAdd {
    public String productId;
    private String productName;
    private int productPrice;
    private Integer categoryId;
    private String description;
}
