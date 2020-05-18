package com.danda.chapter7;

public class seven22 {
    //--------------------------------------------------------

    //TOTAL FAILURE

    //---------------------------------------------------------

    public static void main(String[] args) {
        printQueens();
    }
    public static void printQueens()
    {
        boolean[][] queens = new boolean[8][8];
        for (int i = 0; i < queens.length; i++)
        {
            for (int j = 0; j < queens[0].length; j++)
            {
                if (checkQueen(queens, i, j))
                {
                    queens[i][j] = true;
                    System.out.print("|Q");
                }
                else {
                    System.out.print("| ");
                }
                if (j == queens[0].length-1) System.out.print("|");
            }
            System.out.println();
        }
    }
    //returns true if queen cannot attack
    public static boolean checkQueen(boolean[][] arr, int x, int y)
    {
        //check horizontal
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[x][i]) return false;
        }
        //check vertical
        for (int i = 0; i < arr[0].length; i++)
        {
            if (arr[i][y]) return false;
        }
        //check diagonals
        for (int i = 1; i < arr.length; i++)
        {
            try {
                if (arr[x-i][y-i]) return false;
            } catch (Exception ignored) {}
            try {
                if (arr[x+i][y+i]) return false;
            } catch (Exception ignored) {}
        }
        //check other diagonals
        for (int i = 1; i < arr.length; i++)
        {
            try {
                if (arr[x+i][y-i]) return false;
            } catch (Exception ignored) {}
            try {
                if (arr[x-i][y+i]) return false;
            } catch (Exception ignored) {}
        }
        return true;
    }
}
