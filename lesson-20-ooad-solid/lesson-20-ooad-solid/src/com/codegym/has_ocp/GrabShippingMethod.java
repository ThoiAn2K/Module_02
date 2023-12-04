package com.codegym.has_ocp;

public class GrabShippingMethod implements Shipping {
    @Override
    public long calculateShippingFee() {
        //calculate shipping for grab method
        return 1;
    }
}
