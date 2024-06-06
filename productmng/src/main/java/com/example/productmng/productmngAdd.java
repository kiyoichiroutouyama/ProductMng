package com.example.productmng;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class productmngAdd {
    @NotBlank(message = "商品IDは必須です")
    public String productId;
    @NotBlank(message="商品名は必須です")
    private String productName;
    @NotNull(message="値段は必須です")
    private Integer productPrice;
    @NotNull(message="カテゴリ名はは必須です")
    private Integer categoryId;
    private String description;
}
