package com.shop.productplacement.impl.filter;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiParam;
import lombok.Data;

import javax.ws.rs.PathParam;

@Data
@ApiModel(description = "filtr pro produkty")
public class ProductFilter {

    @PathParam("id")
    @ApiParam(value = "id", required = true)
    @NotNull
    private Long id;
}
