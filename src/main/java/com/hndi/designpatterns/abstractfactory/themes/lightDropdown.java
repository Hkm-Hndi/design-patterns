package com.hndi.designpatterns.abstractfactory.themes;

// Concrete Product A1
public class lightDropdown implements Dropdown {
    @Override
    public void draw() {
        System.out.println("drawing a dropdown and filling it with light grey color.");
    }
}
