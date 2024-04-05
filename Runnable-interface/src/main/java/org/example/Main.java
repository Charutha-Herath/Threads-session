package org.example;

public class Main {
    public static void main(String[] args) {

        One ob1 = new One();
        Two ob2 = new Two();

        Thread t1 = new Thread(ob1);
        Thread t2 = new Thread(ob2);

        t1.start();

        t2.start();
    }
}

class One implements Runnable{
    public void run(){
        for (int i = 1; i <= 5 ; i++) {
            System.out.println("One");

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class Two implements Runnable{
    public void run(){
        for (int i = 1; i <= 5 ; i++) {
            System.out.println("Two");

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}