package org.example;

public class JedinacekVlakno  extends Thread{
    @Override
    public void run(){
        Jedinacek j = Jedinacek.getInstance();
        System.out.println(j);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        j.toString("rano");

        System.out.println(j);
    }
}
