package com.hndi.designpatterns.bridge.abs;

import com.hndi.designpatterns.bridge.imp.DrawingAPI;

public class Circle extends Shape{
    private int x, y, radius;

    public Circle(int x, int y, int radius, DrawingAPI drawingAPI) {
        super(drawingAPI);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }
    @Override
    public void draw() {
        drawingAPI.drawCircle(x, y, radius);
    }
}
