package com.codegym.has_lsp;

public class Cat implements Animal, RunnableAnimal {

    @Override
    public void run() {
        System.out.println("Đang chạy bắt chuột nè");
    }

    //Cat will not violate LSP principle anymore
}
