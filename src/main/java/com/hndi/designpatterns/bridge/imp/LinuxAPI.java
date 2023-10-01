package com.hndi.designpatterns.bridge.imp;

public class LinuxAPI implements DrawingAPI{
    @Override
    public void drawCircle(int x, int y, int radius) {
        System.out.println("Drawing a circle in Linux at (" + x + "," + y + ") with radius " + radius);
    }

    @Override
    public void drawSquare(int x, int y, int side) {
        System.out.println("Drawing a square in Linux at (" + x + "," + y + ") with side " + side);
    }
}
