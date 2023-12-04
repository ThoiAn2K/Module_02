package com.codegym.none_isp;

import com.codegym.none_lsp.Bird;

public class Dog implements Animal {
    @Override
    public void eat() {
        //Eating...
    }

    @Override
    public void run() {
        //Running...
    }

    @Override
    public void fly() {
        //Dog can't fly
        throw new UnsupportedOperationException();
    }

    }


