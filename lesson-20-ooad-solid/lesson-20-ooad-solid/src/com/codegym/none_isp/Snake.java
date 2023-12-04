package com.codegym.none_isp;

public class Snake implements Animal {
    @Override
    public void eat() {
        //Eating...
    }

    @Override
    public void run() {
        //Snake can't run
        throw new UnsupportedOperationException();
    }

    @Override
    public void fly() {
        //Snake can't fly
        throw new UnsupportedOperationException();
    }
}
