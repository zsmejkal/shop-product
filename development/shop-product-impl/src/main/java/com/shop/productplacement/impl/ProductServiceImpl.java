package com.shop.productplacement.impl;


import com.shop.productplacement.impl.filter.ProductFilter;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import java.util.List;

@Component
@Validated
@RequiredArgsConstructor
@Slf4j
public class ProductServiceImpl implements ProductService {

    @Override
    public List<Product> getAll() {
        return null;
    }

    @Override
    public Product get(@Valid ProductFilter filter) {
        return null;
    }
}
