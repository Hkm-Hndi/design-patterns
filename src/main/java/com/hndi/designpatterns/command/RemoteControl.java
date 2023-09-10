package com.hndi.designpatterns.command;

import com.hndi.designpatterns.command.commands.Command;

// Invoker class
public class RemoteControl {
    private Command lightOnClick;
    private Command lightOffClick;

    /* another implementation of the invoker includes setMethod instead of constructor
      and the same button/instance variable can have different commands assigned
     */
    public RemoteControl(Command onclick, Command offClick) {
        this.lightOnClick = onclick;
        this.lightOffClick = offClick;
    }

    public void onClick() {
        lightOnClick.execute();
    }
    public void offClick() {
        lightOffClick.execute();
    }
}
