package com.mjc.stage2.impl;


import lombok.AllArgsConstructor;

@AllArgsConstructor
public class MaxPriceFilteringStrategy implements FilteringStrategy {
    private double maxPrice;

    @Override
    public boolean filter(Product product) {
        return maxPrice >= product.getPrice();
    }
    
    // Write your code here!
}
