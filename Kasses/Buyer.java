package com.Kasses;

import java.util.concurrent.Semaphore;

public class Buyer implements Runnable {
    private Semaphore semaphore;
    private int buyerNum;
    private int id;

    public Buyer(Semaphore semaphore, int id) {
        this.semaphore = semaphore;
        this.id = id;
    }

    @Override
    public void run() {
        try {
            while (buyerNum < 1) {
                semaphore.acquire();

                 if (id%3 == 0){// добавил условие от сЕБЯ, чтобы как-то рандомизировать покупки
                    System.out.println( "Покупатель " + id + " подходит к кассе. Покупатель купил: " + group1);
                }
                else if(id%2 == 0 && id%3!=0){
                    System.out.println( "Покупатель " + id + " подходит к кассе. Покупатель купил: " + group2);
                }
                else {
                    System.out.println( "Покупатель " + id + " подходит к кассе. Покупатель купил: " + group3);
                }

                Thread.sleep(1000);// засыпает, пока обслуживается
                buyerNum++;

                System.out.println("Покупатель " + id + " обслужен");
                semaphore.release();

                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Покупатель" + id + "отказался от покупки");
        }

    }
    String group1 = "Хлеб, батон, молоко";
    String group2 = "Порш, вертолет, акции Газпрома";
    String group3 = "Жвачка";

}
