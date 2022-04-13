package com.netcracker.HW2.ch1.ex14;

public class magicSquare {

    public static void magicSquare(int[][] a) {
        System.out.println(sumRows(a) && sumColumns(a) && sumDiagonals(a));
    }

    public static boolean sumRows(int[][] a) {
        int sumRow1 = 0;
        boolean f = true;
        for (int i = 0; i < a.length; i++)
            sumRow1 += a[1][i];
        for (int i = 1; i < a.length; i++) {
            int sum = 0;
            for (int j = 0; j < a.length; j++) {
                sum += a[i][j];
            }
            if (sum != sumRow1)
                f = false;
        }
        return f;
    }

    public static boolean sumColumns(int[][] a) {
        int sumColumn1 = 0;
        boolean f = true;
        for (int i = 0; i < a.length; i++)
            sumColumn1 += a[1][i];
        int j = 0, sum = 0;
        while (j < a.length) {
            for (int i = 0; i < a.length; i++) {
                sum += a[i][j];
            }
            if (sum != sumColumn1)
                f = false;
            sum = 0;
            j++;
        }
        return f;
    }

    public static boolean sumDiagonals(int[][]a) {
        int sumfirstDiagonal = 0;
        int sumsecondDiagonal = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (i == j)
                    sumfirstDiagonal += a[i][j];
                if (a.length - i-1 == j)
                    sumsecondDiagonal += a[i][j];
            }
        }
        return (sumfirstDiagonal == sumsecondDiagonal);
    }

    public static void main(String[] args) {
        System.out.println("magic square #1");
        int[][] twoDimArray1= {{16,3,2,13},{5,10,11,8},{9,6,7,12},{4,15,14,1}};
        magicSquare(twoDimArray1);

        System.out.println("no magic square");
        int[][] twoDimArray2= {{1,0,0,0},{0,1,0,0},{0,0,1,0},{0,0,0,1}};
        magicSquare(twoDimArray2);

        System.out.println("magic square #2");
        int[][] twoDimArray3= {{8,1,6},{3,5,7},{4,9,2}};
        magicSquare(twoDimArray3);
    }
}

