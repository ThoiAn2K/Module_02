package com.codegym.none_ocp;

public class OrderService {

    public long calculateShippingFee(ShippingMethod shippingMethod) {
        long shippingFee = 0;
        if (shippingMethod.equals("GRAB_FOOD")) {
            //calculate shipping fee for GRAB_FOOD
            shippingFee = 0;
        } else if (shippingMethod.equals("NOW_FOOD")) {
            //calculate shipping fee for NOW_FOOD
            shippingFee = 1;
        } else if (shippingMethod.equals("BAE_MIN")) {
            //calculate shipping fee for BAE_MIN
            shippingFee = 2;
        }
        else if (shippingMethod.equals("SHOPPE_FOOD")) {
            //calculate shipping fee for SHOPPE_FOOD
            shippingFee = 3;
        } //if need to add more shipping method, need one else-if case
        else if (shippingMethod.equals("GOJEX_FOOD")) {
            //calculate shipping fee for GOJEX_FOOD
            shippingFee = 4;
        } //if need to add more shipping method, need one else-if case
        return shippingFee;
    }
}
