package com.vrv.tune;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class TestTask2 implements Runnable {
    @Override
    public void run() {

        synchronized (this) {
            try {
                //µÈ´ý±»»½ÐÑ
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}

 
public class FindObjectWait {
    public static void main(String[] args) throws InterruptedException {

        ExecutorService ex = Executors.newFixedThreadPool(1);
        ex.execute(new TestTask2());

    }
}
