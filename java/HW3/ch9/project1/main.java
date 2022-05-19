package com.netcracker.HW3.ch9.project1;

public class main {
    public static void main(String[] args) {
        Pawn pawn = new Pawn("e2");
        System.out.println(pawn.canMoveTo());

        King king = new King("e1");
        System.out.println(king.canMoveTo());

        Bishop bishop = new Bishop("c1");
        System.out.println(bishop.canMoveTo());

        Knight knight = new Knight("b1");
        System.out.println(knight.canMoveTo());

        Rook rook = new Rook("e5");
        System.out.println(rook.canMoveTo());

        Queen queen = new Queen("d1");
        System.out.println(queen.canMoveTo());
    }
}
