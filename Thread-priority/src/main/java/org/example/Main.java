package org.example;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        Runnable ob1 = new Runnable(){

            @Override
            public void run() {
                for (int i = 1; i <= 5 ; i++) {
                    System.out.println("One");

                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        };

        Runnable ob2 = new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <= 5 ; i++) {
                    System.out.println("Two");

                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        };

        Thread t1 = new Thread(ob1);
        Thread t2 = new Thread(ob2);

        t1.start();
        t1.setName("Thread One");
        t1.setPriority(2);

        System.out.println("Current thread : "+Thread.currentThread());

        Thread.sleep(1000);
        t2.start();
        t2.setName("thread Two");
        t2.setPriority(1);

//        System.out.println("Thread Name : "+t1.getName());
//        System.out.println("Thread Name : "+t2.getName());
//
//        System.out.println("Thread Name : "+t1.getPriority());
//        System.out.println("Thread Name : "+t2.getPriority());



    }
}