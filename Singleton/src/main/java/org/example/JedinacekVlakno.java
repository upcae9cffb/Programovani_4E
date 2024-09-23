package org.example;

public class JedinacekVlakno  extends Thread{
    @Override
    public void run(){
        Jedinacek j = Jedinacek.getInstance();

        while (true) {
            System.out.println(j);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }


            System.out.println(j);
        }
    }
}
