package com.codegym.has_dip;

public class FEDeveloper implements Developer {

    @Override
    public void develop() {
        codeReactJS();
//        codeVueJS();
    }

    public void codeReactJS() {
        System.out.println("Coding ReactJS...");
    }

    public void codeVueJS() {
        System.out.println("Coding VueJS...");
    }
}
