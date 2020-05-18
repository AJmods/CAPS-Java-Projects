package com.danda.chapter8;

import java.util.Scanner;

public class eight20 {



    public static void main(String[] args) {
        boardPiece[][] board = new boardPiece[6][7];
        for (int i = 0; i < board.length; i++) for (int j = 0; j < board[0].length; j++) board[i][j] = boardPiece.NOTHING; //make board nothing

        Scanner scanner = new Scanner(System.in);

        printBoard(board);

        int answer = -1;
        String winner = "";
        do {
            answer = -1;
            while ((answer< 0 || answer >6) && !checkWin(board)) {
                System.out.println("drop a RED disk at column (0-6)");
                answer = scanner.nextInt();
                if (answer <0 || answer > 6) System.out.println("You idiot enter a number between 0 and 6");
            } //repeat until proper number
            if (answer != -1 && !checkWin(board)) {
                board = addPiece(board, answer, boardPiece.RED);
                printBoard(board);
            }

            answer = -1;
             while ((answer< 0 || answer > 6) && !checkWin(board)) {
                 System.out.println("drop a Yellow disk at column (0-6)");
                answer = scanner.nextInt();
                if (answer <0 || answer > 6) System.out.println("You idiot enter a number between 0 and 6");
            } //repeat until proper number

            if (answer!= -1 && !checkWin(board)) {
                board = addPiece(board, answer, boardPiece.YELLOW);
                printBoard(board);
            }
            else if (winner.equals("")) winner = "red"; //red on yellow because this is how it works


        } while (!checkWin(board)); //run until a player wins

        if (winner.equals("")) winner = "yellow";

        System.out.println(winner + " wins");

    }

    public static boolean checkWin(boardPiece[][] board)
    {
        // code from https://codereview.stackexchange.com/questions/127091/java-connect-four-four-in-a-row-detection-algorithms
        final int HEIGHT = board.length;
        final int WIDTH = board[0].length;
        final int EMPTY_SLOT = 0;
        for (int r = 0; r < HEIGHT; r++) { // iterate rows, bottom to top
            for (int c = 0; c < WIDTH; c++) { // iterate columns, left to right
                boardPiece player = board[r][c];
                if (player == boardPiece.NOTHING)
                    continue; // don't check empty slots

                if (c + 3 < WIDTH &&
                        player == board[r][c+1] && // look right
                        player == board[r][c+2] &&
                        player == board[r][c+3])
                    return true;
                if (r + 3 < HEIGHT) {
                    if (player == board[r+1][c] && // look up
                            player == board[r+2][c] &&
                            player == board[r+3][c])
                        return true;
                    if (c + 3 < WIDTH &&
                            player == board[r+1][c+1] && // look up & right
                            player == board[r+2][c+2] &&
                            player == board[r+3][c+3])
                        return true;
                    if (c - 3 >= 0 &&
                            player == board[r+1][c-1] && // look up & left
                            player == board[r+2][c-2] &&
                            player == board[r+3][c-3])
                        return true;
                }
            }
        }
        return false; // no winner found
    }

    public static boardPiece[][] addPiece(boardPiece[][] board, int col, boardPiece type)
    {
        boolean satisfied = false;
        int counter = 0;
        while (!satisfied)
        {
           if (board[counter][col] == boardPiece.RED || board[counter][col] == boardPiece.YELLOW) {
               counter++;
           }
           else {
               board[counter][col] = type;
               satisfied = true;
           }

        }
        return board;
    }

    public static void printBoard(boardPiece[][] board) {
        for (int i = board.length-1; i>=0; i--) {
            for (boardPiece piece : board[i]) {
                System.out.print("|" + pieceToString(piece));
            }
            System.out.print("|");
            System.out.println();
        }
    }
    public static String pieceToString(boardPiece piece)
    {
        if (piece == boardPiece.NOTHING) return " ";
        else if (piece == boardPiece.RED) return "R";
        else if (piece == boardPiece.YELLOW) return "Y";
        return "something went wrong and I don't know why";
    }

}
enum boardPiece {
    NOTHING,
    RED,
    YELLOW
}