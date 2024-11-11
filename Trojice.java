package org.example;

import java.util.Iterator;

public class Trojice implements Iterable<Integer>{
    //interni trida
    class InterniIterator implements Iterator<Integer> {
        int pozice = 0;


        public boolean hasNext(){
            return pozice < 3;
        }

        public Integer next(){
            return switch (pozice++) {
                case 0 -> a;// uvnitr vnorene tridy muzu sahat na hodnoty te tridy nademnou
                case 1 -> b;
                default ->c;
            };
        }
//    public MujIterator dejIterator(){
//        return new MujIterator(this);
//    }

    }
    int a,b,c;
    public Trojice(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;

    }
    public Iterator<Integer> iterator(){
        return new InterniIterator();
    }


}
