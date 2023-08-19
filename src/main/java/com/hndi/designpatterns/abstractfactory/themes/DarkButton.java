package com.hndi.designpatterns.abstractfactory.themes;

// Concrete Product B1
public class DarkButton implements Button {
    @Override
    public void draw() {
        System.out.println("drawing a Button and filling it with dark grey color.");
    }
}
