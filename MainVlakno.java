package org.example;

import java.util.ArrayList;

public class MainVlakno {
    public static void main(String[] args) throws InterruptedException {
        ArrayList<Integer> list = new ArrayList<>();

        Runnable mojeVlakno = new MojeVlakno();
        Thread tr = new Thread(mojeVlakno);

        Runnable mojeVlakno1 = new Runnable() {
            public void run() {
                for(int i = 'a'; i<'z'; i++)
                    list.add(i);
            }
        };
        Thread tr1 = new Thread(mojeVlakno1);

        Runnable mojevlakno2 = () -> { //Lambda expresion jenom kdyz ta trida ma jen jednu metodu, setri to miszto jako
                for(int i = -1; i>-100; i--){
                    list.add(i);
                }
        };
        Thread tr2 = new Thread(mojevlakno2);

        
        tr1.start();
        tr2.start();

        tr1.join();
        tr1.join();

        System.out.println(list);
    }
}
