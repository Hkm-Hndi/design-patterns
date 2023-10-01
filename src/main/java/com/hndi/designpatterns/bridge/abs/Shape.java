package com.hndi.designpatterns.bridge.abs;

import com.hndi.designpatterns.bridge.imp.DrawingAPI;

public abstract class Shape {
    protected DrawingAPI drawingAPI;

    public Shape(DrawingAPI drawingAPI) {
        this.drawingAPI = drawingAPI;
    }

    public abstract void draw();
}
