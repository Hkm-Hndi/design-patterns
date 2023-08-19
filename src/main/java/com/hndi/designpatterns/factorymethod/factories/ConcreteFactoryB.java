package com.hndi.designpatterns.factorymethod.factories;

import com.hndi.designpatterns.factorymethod.products.*;

public class ConcreteFactoryB implements Factory {
    @Override
    public Product getProduct() {
        return new ConcreteProductB();
    }
}
