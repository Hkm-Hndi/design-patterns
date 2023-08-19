package com.hndi.designpatterns.factorymethod.products;


public class ConcreteProductA implements Product {
    @Override
    public void create() {
        System.out.println("Creating Concrete Product A");
    }
}
