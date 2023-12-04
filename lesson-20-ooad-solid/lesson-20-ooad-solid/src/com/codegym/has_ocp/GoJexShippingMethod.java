package com.codegym.has_ocp;

public class GoJexShippingMethod implements Shipping{
    @Override
    public long calculateShippingFee() {
        return 4;
    }
}
