package ttt;

import java.util.Scanner;

public class TTT {

    public Scanner in = new Scanner(System.in);
    public int row, col;
    public char[][] board;
    public char turn = 'X';

    public void initializeBoard() {
        this.board = new char[3][3];
        for (int i = 0; i < this.board.length; i++) {
            for (int j = 0; j < this.board[i].length; j++) {
                this.board[i][j] = '_';
            }
        }
    }

    public void printBoard() {
        for (int i = 0; i < this.board.length; i++) {
            for (int j = 0; j < this.board[i].length; j++) {
                if (j == 0) {
                    System.out.print("| ");
                }
                System.out.print(this.board[i][j] + " | ");
            }
            System.out.println();
        }
    }

    public void playing() {
        boolean play = true;

        while (play) {
            System.out.println("Player " + turn + " Enter ROW and COLUMN!");
            this.row = this.in.nextInt() - 1;
            this.col = this.in.nextInt() - 1;
            this.board[this.row][this.col] = this.turn;

            if (gameover(row, col)) {
                play = false;
                System.out.println("Game Over!!!!!!!!_____Player " + turn + " Wins");
            }
            printBoard();

            if (turn == 'X') {
                this.turn = 'O';
            } else {
                turn = 'X';
            }

        }
    }

    public boolean gameover(int rowM, int colM) {
        if (this.board[0][colM] == this.board[1][colM] && this.board[0][colM] == this.board[2][colM]) {
            return true;
        }
        if (this.board[rowM][0] == this.board[rowM][1] && this.board[rowM][0] == this.board[rowM][2]) {
            return true;
        }
        if (this.board[0][0] == this.board[1][1] && this.board[0][0] == this.board[2][2] && this.board[1][1] != '_') {
            return true;
        }
        if (this.board[0][2] == this.board[1][1] && this.board[2][0] == this.board[1][1] && this.board[1][1] != '_') {
            return true;
        }
        return false;
    }
}
