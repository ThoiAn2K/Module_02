package com.codegym.has_ocp;

public class ShoppeShippingMethod implements Shipping {
    @Override
    public long calculateShippingFee() {
        //tự tính
        return 5;
    }
}
