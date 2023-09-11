package com.hndi.designpatterns.adapter;

public class Adapter implements Target{
    Adaptee adaptee;

    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void request(int a, int b) {
        System.out.println("Adapter's request");
        adaptee.specificRequest(a, b, 0);
    }
}
