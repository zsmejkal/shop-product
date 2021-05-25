package com.shop.productplacement.impl;


import io.swagger.annotations.ApiModel;
import lombok.*;

@Data
@ApiModel(description="Product")
@AllArgsConstructor
@NoArgsConstructor
public class Product {

    @Getter
    @Setter
    private Long id;

    @Getter
    @Setter
    private String name;

    @Getter
    @Setter
    private String imgUri;

    @Getter
    @Setter
    private Integer price;

    @Getter
    @Setter
    private String description;

}
