package org.example;

import lombok.ToString;

@ToString
public class Jedinacek {
    private static Jedinacek singletonInstance;
    private Jedinacek() { }
    private String stav = "novy";

    public static Jedinacek getInstance() {
        if (null == singletonInstance) {
            singletonInstance = new Jedinacek();
        }
        return singletonInstance;
    }

    public void toString(String s){
        stav = s;

    }
}
