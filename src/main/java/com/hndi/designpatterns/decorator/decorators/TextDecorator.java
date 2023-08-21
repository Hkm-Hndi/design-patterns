package com.hndi.designpatterns.decorator.decorators;

import com.hndi.designpatterns.decorator.Text;

public abstract class TextDecorator implements Text {
    protected Text decoratedText;

    public TextDecorator(Text decoratedText) {
        this.decoratedText = decoratedText;
    }

    @Override
    public String getContent() {
        return decoratedText.getContent();
    }
}
