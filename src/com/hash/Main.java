package com.hash;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        String method = args[0];
        String text = args[1];
        if (method.contains("dec"))
            System.out.println(AES256.decrypt(text));
        else if (method.contains("enc"))
            System.out.println(AES256.encrypt(text));
        else
            System.out.println("can't find method");
    }
}
