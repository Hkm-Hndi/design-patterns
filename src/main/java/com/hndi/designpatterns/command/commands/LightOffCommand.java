package com.hndi.designpatterns.command.commands;

import com.hndi.designpatterns.command.Light;

public class LightOffCommand implements Command {
    private Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    public void execute() {
        light.turnOff();
    }
}