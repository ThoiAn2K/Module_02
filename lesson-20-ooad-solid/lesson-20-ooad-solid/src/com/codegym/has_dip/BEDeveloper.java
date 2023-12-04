package com.codegym.has_dip;

public class BEDeveloper implements Developer {

    @Override
    public void develop() {
//        codeJava();
        codeCSharp();
    }

    private void codeJava() {
        System.out.println("Coding Java...");
    }

    private void codeCSharp() {
        System.out.println("Coding C#...");
    }
}
