package org.example;

import java.util.Iterator;

public class MujIterator implements Iterator<Integer> {
    int pozice = 0;
    Trojice trojice;

    public MujIterator(Trojice trojice){
        this.trojice = trojice;

    }

    public boolean hasNext(){
        return pozice < 3;
    }

    public Integer next(){
        return switch (pozice++) {
            case 0 -> trojice.a;
            case 1 -> trojice.b;
            default -> trojice.c;
        };
    }
//    public MujIterator dejIterator(){
//        return new MujIterator(this);
//    }

}
