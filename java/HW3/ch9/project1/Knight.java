package com.netcracker.HW3.ch9.project1;

public class Knight extends ChessPiece {
    public Knight(String position) {
        super.setPosition(position);
        int[][] possiblePosition = new int[8][8];
        int x = Character.getNumericValue(position.charAt(1)) - 1;
        int y = Character.getNumericValue(position.charAt(0)) - 10;
        if (x + 2 < 8 && y + 1 < 8)
            possiblePosition[x + 2][y + 1] = 1;
        if (x + 2 < 8 && y - 1 > -1)
            possiblePosition[x + 2][y - 1] = 1;

        if (x + 1 < 8 && y + 2 < 8)
            possiblePosition[x + 1][y + 2] = 1;
        if (x + 1 < 8 && y - 2 > -1)
            possiblePosition[x + 1][y - 2] = 1;

        if (x - 2 > -1 && y + 1 < 8)
            possiblePosition[x - 2][y + 1] = 1;
        if (x - 2 > -1 && y - 1 > -1)
            possiblePosition[x - 2][y - 1] = 1;

        if (x - 1 > -1 && y + 2 < 8)
            possiblePosition[x - 1][y + 2] = 1;
        if (x - 1 > -1 && y - 2 > -1)
            possiblePosition[x - 1][y - 2] = 1;
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (possiblePosition[i][j] == 1)
                    super.setMoveTo(getString(i, j));
            }
        }
    }
}
