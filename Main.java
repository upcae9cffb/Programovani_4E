package org.example;



//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {


        Trojice t = new Trojice(2,5,6);
        MujIterator it = t.iterator();

        for (int x : t){

            for (int y : t){
                System.out.println(x + " " + y);
            }
        }

    }

}