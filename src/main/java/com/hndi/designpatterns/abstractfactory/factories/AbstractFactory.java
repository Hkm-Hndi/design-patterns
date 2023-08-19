package com.hndi.designpatterns.abstractfactory.factories;

import com.hndi.designpatterns.abstractfactory.themes.*
        ;

// Abstract Factory
public interface AbstractFactory {
    Dropdown createDropdown();
    Button createButton();
}