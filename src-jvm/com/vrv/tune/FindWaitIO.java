package com.vrv.tune;

import java.io.IOException;
import java.io.InputStream;

public class FindWaitIO {
    public static void main(String[] args) throws InterruptedException, IOException {

        InputStream is = System.in;
        int i = is.read();
        System.out.println("exit¡£");

    }
}
