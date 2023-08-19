package com.hndi.designpatterns.abstractfactory.factories;

import com.hndi.designpatterns.abstractfactory.themes.*;
public class DarkThemeFactory implements AbstractFactory{
    @Override
    public Dropdown createDropdown() {
        return new DarkDropdown();
    }

    @Override
    public Button createButton() {
        return new DarkButton();
    }
}
