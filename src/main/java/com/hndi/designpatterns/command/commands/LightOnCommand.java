package com.hndi.designpatterns.command.commands;

import com.hndi.designpatterns.command.Light;

public class LightOnCommand implements Command {
    private Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }
    public void execute() {
        light.turnOn();
    }

}
