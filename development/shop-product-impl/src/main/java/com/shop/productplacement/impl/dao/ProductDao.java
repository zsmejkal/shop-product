package com.shop.productplacement.impl.dao;


import com.shop.productplacement.impl.Product;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public class ProductDao {

    @Results(id = "Product", value = {
            @Result(property = "id", column = "ID"),
            @Result(property = "name", column = "NAME"),
            @Result(property = "imgUri", column = "IMG_URI"),
            @Result(property = "price", column = "PRICE"),
            @Result(property = "description", column = "DESCRIPTION")
    })
    @Select("SELECT t.ID, t.NAME, t.IMG_URI, t.PRICE, t.DESCRIPTION FROM PRODUCT t")
    List<Product> findAll() {
        return null;
    }

}
