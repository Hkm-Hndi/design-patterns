package com.hndi.designpatterns.observer.observers;

import com.hndi.designpatterns.observer.observables.WeatherStation;
import com.hndi.designpatterns.observer.observers.Observer;

public class TemperatureDisplay implements Observer {
    WeatherStation weatherStation;

    public TemperatureDisplay(WeatherStation ws) {
        this.weatherStation = ws;
    }
    public void update() {
        System.out.println("Temperature Display: Temperature is " + weatherStation.getTemperature());
    }
}
