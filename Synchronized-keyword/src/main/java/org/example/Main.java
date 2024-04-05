package org.example;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        final Calculation cal = new Calculation();
        Thread t1 = new Thread(){
            @Override
            public void run() {

                for (int i = 1; i<=1000; i++) {
                    cal.increment();
                }
            }
        };

        Thread t2 = new Thread(){
            @Override
            public void run() {

                for (int i = 1; i<=1000; i++) {
                    cal.increment();
                }
            }
        };
        t1.start();
        t2.start();

        t1.join();
        t2.join();


        System.out.println("Count : "+cal.num);
    }
}

class Calculation{
    int num;

    public  synchronized void increment(){
        num++;

    }
}