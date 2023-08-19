package com.hndi.designpatterns.observer.observables;

import com.hndi.designpatterns.observer.observers.Observer;

public interface Observable {
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}
