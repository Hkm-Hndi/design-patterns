package com.hndi.designpatterns.factorymethod.products;

public class ConcreteProductB implements Product {
    @Override
    public void create() {
        System.out.println("Creating Concrete Product B");
    }
}
