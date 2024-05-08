package _03_Matrix_or_2d_array.tic_tac_toe;

import java.util.Scanner;

public class tic_tac_toe {
    private static char[][] board = new char[3][3];
    private static char currentPlayer = 'X';

    public static void main(String[] args) {
        initializeBoard();
        printBoard();

        while(!isBoardFull() && !checkForWin()){
            getPlayerMove();
            printBoard();

            if (checkForWin()) {
                System.out.println("Player " + currentPlayer + " wins!");
            } else {
                System.out.println("It's a tie!");
            }

        }
    }

    private static void initializeBoard(){
        for(int i  = 0; i < 3; i++){
            for(int j  = 0; j < 3; j++){
                board[i][j] = '-';
            }
        }
    }

    private static void printBoard() {
        System.out.println("-------------");
        for (int i = 0; i < 3; i++) {
            System.out.print("| ");
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " | ");
            }
            System.out.println();
            System.out.println("-------------");
        }
    }

    private static void getPlayerMove() {
        Scanner scanner = new Scanner(System.in);
        int row, col;
        do {
            System.out.println("Player " + currentPlayer + ", enter your move (row and column):");
            row = scanner.nextInt() - 1;
            col = scanner.nextInt() - 1;
        } while (row < 0 || row >= 3 || col < 0 || col >= 3 || board[row][col] != '-');
        board[row][col] = currentPlayer;
    }

    private static boolean isBoardFull() {
        for(int i  = 0; i < 3; i++){
            for(int j  = 0; j < 3; j++){
                if(board[i][j] == '-'){
                    return false;
                }
            }
        }
        return true;
    }

    private static boolean checkForWin() {
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == currentPlayer && board[i][1] == currentPlayer && board[i][2] == currentPlayer) {
                return true;
            }
        }
        for (int j = 0; j < 3; j++) {
            if (board[0][j] == currentPlayer && board[1][j] == currentPlayer && board[2][j] == currentPlayer) {
                return true;
            }
        }
        if (board[0][0] == currentPlayer && board[1][1] == currentPlayer && board[2][2] == currentPlayer) {
            return true;
        }
        if (board[0][2] == currentPlayer && board[1][1] == currentPlayer && board[2][0] == currentPlayer) {
            return true;
        }
        return false;

    }

}
