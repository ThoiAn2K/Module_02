package com.codegym.has_isp;

public class Dog implements Animal, RunnableAnimal {

    @Override
    public void eat() {
        //Eating...
    }

    @Override
    public void run() {
        //Running...
    }
}
