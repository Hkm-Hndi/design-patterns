package com.hndi.designpatterns.observer.observers;

import com.hndi.designpatterns.observer.observables.WeatherStation;
import com.hndi.designpatterns.observer.observers.Observer;

public class PhoneApp implements Observer {
    WeatherStation weatherStation;

    public PhoneApp(WeatherStation ws) {
        this.weatherStation = ws;
    }

    @Override
    public void update() {
        System.out.println("Phone App: Current temperature is " + weatherStation.getTemperature());
    }
}
