package com.coderscampus.arraylist;

import java.util.ArrayList;
import java.util.List;

public class CustomArrayListApp {

    public static void main(String[] args) {

        CustomArrayList<Integer> newCustomArrayList = new CustomArrayList<>();

        long start = System.currentTimeMillis();

        // Test for 3 million integer insertion
        for (int i = 0; i < 3_000_000; i++) {
            newCustomArrayList.add(i);
        }

        long finish = System.currentTimeMillis();

        System.out.println( finish - start + " ms");
        System.out.println(newCustomArrayList.getSize());
    }

}
