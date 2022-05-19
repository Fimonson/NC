package com.netcracker.HW3.ch9.project1;

public class Pawn extends ChessPiece {
    public Pawn(String position) {
        super.setPosition(position);
        char y = position.charAt(1);
        if (y < '8') {
            ++y;
        }
        super.setMoveTo(position.replace(--y, ++y));
    }
}
