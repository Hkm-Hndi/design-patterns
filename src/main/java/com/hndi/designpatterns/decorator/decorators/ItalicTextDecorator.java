package com.hndi.designpatterns.decorator.decorators;

import com.hndi.designpatterns.decorator.Text;

public class ItalicTextDecorator extends TextDecorator {
    public ItalicTextDecorator(Text decoratedText) {
        super(decoratedText);
    }

    @Override
    public String getContent() {
        return "<i>" + super.getContent() + "</i>";
    }
}
