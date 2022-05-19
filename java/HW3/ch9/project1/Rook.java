package com.netcracker.HW3.ch9.project1;

public class Rook extends ChessPiece {
    public Rook(String position){
        super.setPosition(position);
        int[][] possiblePosition = new int[8][8];
        int x = Character.getNumericValue(position.charAt(1))-1;
        int y = Character.getNumericValue(position.charAt(0)) - 10;
        while (x < 7) {
            ++x;
            possiblePosition[x][y] = 1;
        }
        x = Character.getNumericValue(position.charAt(1)) - 1;
        while (x > 0) {
            --x;
            possiblePosition[x][y] = 1;
        }

        x = Character.getNumericValue(position.charAt(1)) - 1;
        while (y > 0) {
            --y;
            possiblePosition[x][y] = 1;
        }
        y = Character.getNumericValue(position.charAt(0)) - 10;
        while (y < 8) {
            possiblePosition[x][y] = 1;
            ++y;
        }
        possiblePosition[Character.getNumericValue(position.charAt(1)) - 1]
                [Character.getNumericValue(position.charAt(0)) - 10] = 0;
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (possiblePosition[i][j] == 1)
                    super.setMoveTo(getString(i, j));
            }
        }
    }
}
