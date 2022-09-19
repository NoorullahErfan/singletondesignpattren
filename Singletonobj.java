package com.Singletonobj;
public class Singletonobj {
    private static Singletonobj instance  = new Singletonobj();

private Singletonobj(){}
public static Singletonobj getobj(){
    return instance;
}
public void showmessage() {
    System.out.println("hello world");
}
}



