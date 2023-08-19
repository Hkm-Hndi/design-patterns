package com.hndi.designpatterns.abstractfactory.themes;

// Concrete Product A2
public class DarkDropdown implements Dropdown {
    @Override
    public void draw() {
        System.out.println("drawing a dropdown and filling it with dark grey color.");
    }
}