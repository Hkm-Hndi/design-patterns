package com.hndi.designpatterns.proxy;

public class LazyBookParserProxy implements BookParser {
    RealBookParser realBookParser;
    String book;
    public LazyBookParserProxy(String s){
        this.book=s;
    }

    @Override
    public int request() {
        if (realBookParser==null)
            realBookParser=new RealBookParser(this.book);
        return this.realBookParser.request();
    }
}
