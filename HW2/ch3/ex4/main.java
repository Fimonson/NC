package com.netcracker.HW2.ch3.ex4;
import com.netcracker.HW2.ch3.IntSequence;

public class main{

    public static void main(String[] args) {
        IntSequence sequence = IntSequence.of(2, 2, 8, 3, 2, 2);
        while (sequence.hasNext()) {
            System.out.println(sequence.next());
        }
    }
}
