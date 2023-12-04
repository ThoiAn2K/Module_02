package com.codegym.none_lsp;

public class Cat implements Animal {
    @Override
    public void fly() {
        // Cat can't fly
        // -> Cat violates LSP principle
        throw new UnsupportedOperationException();
    }
}
