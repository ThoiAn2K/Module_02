package com.codegym.has_ocp;

public class OrderService {

    private Shipping shipping;

    public long calculateShipping() {
        //find relevant shipping implementation
        // then call calculateShippingFee() method
        //example: shipping method is grab, we'll call
        //GrabShippingMethod to calculate shipping fee
        ShoppeShippingMethod shippingMethod = new ShoppeShippingMethod();
        shippingMethod.calculateShippingFee();
        GoJexShippingMethod goJexShippingMethod = new GoJexShippingMethod();
        goJexShippingMethod.calculateShippingFee();
        return 0;
    }
}
