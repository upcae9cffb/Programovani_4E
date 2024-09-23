package org.example;

public final class Dvoucisli {
     final int a;
     final int b;

    public  Dvoucisli(int a, int b){
        this.a = a;
        this.b = b;
    }

    public static Dvoucisli Nasobeni(Dvoucisli x, Dvoucisli y){
        Dvoucisli c = new Dvoucisli(x.a*y.a - x.b*y.b ,x.a*y.b + x.b*y.a);


        return c;
    }
}
