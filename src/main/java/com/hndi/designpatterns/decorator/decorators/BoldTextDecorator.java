package com.hndi.designpatterns.decorator.decorators;

import com.hndi.designpatterns.decorator.Text;

public class BoldTextDecorator extends TextDecorator {
    public BoldTextDecorator(Text decoratedText) {
        super(decoratedText);
    }

    @Override
    public String getContent() {
        return "<b>" + super.getContent() + "</b>";
    }
}
