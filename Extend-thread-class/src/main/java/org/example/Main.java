package org.example;

public class Main {

    public static void main(String[] args) {

        One ob1 = new One();
        Two ob2 = new Two();

        ob1.start();

        ob2.start();
    }
}

class One extends Thread{
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

class Two extends Thread{
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