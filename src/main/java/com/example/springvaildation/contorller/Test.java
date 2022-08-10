package com.example.springvaildation.contorller;

import java.util.HashMap;

public class Test {
    public static void main(String[] args) {
        HashMap<String,Integer> hs = new HashMap<>();
        hs.put("A",1);

        char a = 'A';

        System.out.println("a = " +  hs.get(a+""));
    }
}
