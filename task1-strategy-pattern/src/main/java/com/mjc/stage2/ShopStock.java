package com.mjc.stage2;

import com.mjc.stage2.impl.ManufactureFilteringStrategy;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ShopStock {
    private final List<Product> productList;

    public ShopStock(List<Product> productList) {
        this.productList = productList;
    }

    public List<Product> executeFilteringStrategy(FilteringStrategy filteringStrategy){
        return productList.stream().filter(product -> filteringStrategy.filter(product)).
                collect(Collectors.toList());
    }
    // Write your code here!
}
