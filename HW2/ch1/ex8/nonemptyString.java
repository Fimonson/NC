package com.netcracker.HW2.ch1.ex8;

public class nonemptyString {

    public static void nonempty(String s) {
        String[] result = s.split(" ");
        for (int i = 0; i < result.length; i++) {
            // if (!result[i].contains(" "))
            System.out.print(result[i]);
        }
        System.out.println("*");
    }


    public static void main(String[] args) {
        nonempty("g ood luck have fun");
        nonempty(" Gleb ");
        nonempty("       ");
        nonempty(" foo  ** *     bar  ");
    }
}
