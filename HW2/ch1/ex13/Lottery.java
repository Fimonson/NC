package com.netcracker.HW2.ch1.ex13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Lottery {

    public static void Lottery() {
        ArrayList<Integer> tickets = new ArrayList<>();
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 1; i < 50; i++)
            tickets.add(i);
        int j=0;
        while(j<6) {
            Random r = new Random();
            int x=r.nextInt(48);
            if(x<=tickets.size()) {
                result.add(tickets.get(x));
                tickets.remove(x);
                j++;
            }
        }
        result.sort(Integer::compareTo);
        System.out.println(result);
    }


    public static void main(String[] args) {
        System.out.println("Lottery #1");
        Lottery();
        System.out.println();

        System.out.println("Lottery #2");
        Lottery();
        System.out.println();

        System.out.println("Lottery #3");
        Lottery();
    }
}
