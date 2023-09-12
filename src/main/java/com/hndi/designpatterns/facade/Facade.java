package com.hndi.designpatterns.facade;

public class Facade {
    private Subsystem1 subsystem1;
    private Subsystem2 subsystem2;

    public Facade() {
        this.subsystem1 = new Subsystem1();
        this.subsystem2 = new Subsystem2();
    }

    public void performOperations() {
        System.out.println("Facade is performing operations:");
        subsystem1.operation1();
        subsystem1.operation2();
        subsystem2.operation3();
        subsystem2.operation4();
    }
}