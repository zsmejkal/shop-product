package com.shop.productplacement.impl;


import com.shop.productplacement.impl.filter.ProductFilter;
import io.swagger.annotations.ApiOperation;

import javax.validation.Valid;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public interface ProductService {

    @GET
    @Path("/products")
    @ApiOperation(value = "")
    List<Product> getAll();

    @GET
    @Path("/product/{id}")
    @ApiOperation(value = "")
    Product get(final @Valid @BeanParam ProductFilter filter);


}
