package org.example;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Jedinacek j =Jedinacek.getInstance();
        new JedinacekVlakno().start();

        Thread.sleep(5000);
        j.setStav("jupijupi");
        Thread.sleep(5000);
        j.setStav("rano rano rano");
        Thread.sleep(5000);
        j.setStav("************************");
        Thread.sleep(5000);
        j.setStav("konec");
        Thread.sleep(5000);
        j.setStav("jsemprogrmaer");

        System.out.println(j);

        Dvoucisli x = new Dvoucisli(5,7);
        System.out.println(x.Scitani());
    }
}