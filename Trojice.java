package org.example;

public class Trojice implements Iterable<Integer>{
    int a,b,c;
    public Trojice(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;

    }
    public MujIterator iterator(){
        return new MujIterator(this);
    }


}
