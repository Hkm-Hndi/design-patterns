package com.hndi.designpatterns.factorymethod.factories;

import com.hndi.designpatterns.factorymethod.products.*;

public class ConcreteFactoryA implements Factory {
    @Override
    public Product getProduct() {
        return new ConcreteProductA();
    }
}
