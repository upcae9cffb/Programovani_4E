package org.example;

public class MojeVlakno implements Runnable {
    public void run() {
        for(int i = 0; i<100; i++)
            System.out.println(i);
    }
}
