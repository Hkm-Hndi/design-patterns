package com.hndi.designpatterns.abstractfactory.factories;

import com.hndi.designpatterns.abstractfactory.themes.*;
public class LightTheme implements AbstractFactory {
    @Override
    public Dropdown createDropdown() {
        return new lightDropdown();
    }

    @Override
    public Button createButton() {
        return new LightButton();
    }
}
