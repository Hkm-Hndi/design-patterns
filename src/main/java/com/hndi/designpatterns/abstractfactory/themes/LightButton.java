package com.hndi.designpatterns.abstractfactory.themes;

// Concrete Product B2
public class LightButton implements Button {
    @Override
    public void draw() {
        System.out.println("drawing a button and filling it with light grey color.");
    }
}
