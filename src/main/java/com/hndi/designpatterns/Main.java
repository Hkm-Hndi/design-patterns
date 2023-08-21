package com.hndi.designpatterns;

import com.hndi.designpatterns.observer.observers.*;
import com.hndi.designpatterns.observer.observables.*;

import com.hndi.designpatterns.factorymethod.factories.*;
import com.hndi.designpatterns.factorymethod.products.*;

import com.hndi.designpatterns.abstractfactory.factories.*;
import com.hndi.designpatterns.abstractfactory.themes.*;

import com.hndi.designpatterns.decorator.*;
import com.hndi.designpatterns.decorator.decorators.*;

public class Main {
    public static void main(String[] args) {

        //Observer Pattern example
        WeatherStation weatherStation = new WeatherStation();

        TemperatureDisplay display1 = new TemperatureDisplay(weatherStation);
        PhoneApp app1 = new PhoneApp(weatherStation);

        weatherStation.registerObserver(display1);
        weatherStation.registerObserver(app1);

        weatherStation.setTemperature(25.5f);
        weatherStation.setTemperature(30.0f);

        weatherStation.removeObserver(display1);

        weatherStation.setTemperature(28.7f);


        //Singleton Pattern example
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();

        System.out.println(singleton1 == singleton2); //  Both instances will be the same //Output: true


        //Factory Method Pattern example
        Factory factoryA = new ConcreteFactoryA();
        Product productA = factoryA.getProduct();
        productA.create();

        Factory factoryB = new ConcreteFactoryB();
        Product productB = factoryB.getProduct();
        productB.create();


        //Abstract Factory Pattern example
        AbstractFactory darkTheme = new DarkThemeFactory();
        Dropdown darkDropdown = darkTheme.createDropdown();
        Button darkButton = darkTheme.createButton();
        darkDropdown.draw();
        darkButton.draw();

        AbstractFactory lightTheme = new LightTheme();
        Dropdown lightDropdown = lightTheme.createDropdown();
        Button lightButton = lightTheme.createButton();
        lightDropdown.draw();
        lightButton.draw();


        //Decorator Pattern Example
        Text plainText = new PlainText("Plain Text!");
        System.out.println( plainText.getContent());

        Text boldText = new BoldTextDecorator(new PlainText("Bold Text Decorating Plain Text!"));
        System.out.println( boldText.getContent());

        Text italicBoldText = new ItalicTextDecorator(new BoldTextDecorator(new PlainText("Italic Text " +
                "Decorating Bold Text " +
                "Decorating Plain Text!")));
        System.out.println( italicBoldText.getContent());

    }
}