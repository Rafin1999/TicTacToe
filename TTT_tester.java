package ttt;

import java.util.Scanner;

public class TTT_tester {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        TTT game = new TTT();
        game.initializeBoard();
        game.printBoard();
        game.playing();

    }

}
