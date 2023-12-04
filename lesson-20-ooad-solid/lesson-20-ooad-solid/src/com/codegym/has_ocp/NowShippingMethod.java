package com.codegym.has_ocp;

public class NowShippingMethod implements Shipping {
    @Override
    public long calculateShippingFee() {
        //calculate shipping fee for grab method
        return 2;
    }
}
