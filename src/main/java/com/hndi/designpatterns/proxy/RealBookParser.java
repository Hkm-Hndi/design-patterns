package com.hndi.designpatterns.proxy;

public class RealBookParser implements BookParser {
    String book;
    public RealBookParser(String s){
        this.book=s; //and some other expensive construction logic
    }
    @Override
    public int request() {
        System.out.println("RealSubject: Handling the request");
        return this.book.length();
    }
}
