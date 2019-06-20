package com.Kasses;

import java.util.concurrent.Semaphore;

public class Main {
    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(3);
        for (int i = 0; i < 10  ; i++) {//создаем покупателей
            new Thread (new Buyer(semaphore, i)).start();//
        }
    }
}
