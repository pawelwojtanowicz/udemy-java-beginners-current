package tic_tac_toe;

import java.util.Scanner;


public class TicTacToe {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        char[] pos = {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '};
        int input;
        char turn = 'X';
        int currentTurn = 0;

        System.out.println("This is tic-tac-toe game. The positions in diagram are as follows: ");
        System.out.println("\n " + 7 + " | " + 8 + " | " + 9 + " ");
        System.out.println("---+---+---");
        System.out.println(" " + 4 + " | " + 5 + " | " + 6 + " ");
        System.out.println("---+---+---");
        System.out.println(" " + 1 + " | " + 2 + " | " + 3 + " \n");

        while (true) {
            do {
                System.out.print("Enter position: ");
                input = scanner.nextInt();
                if (pos[input - 1] == 'X' || pos[input - 1] == 'O')
                    System.out.println("The position is already occupied, enter different one.");

            } while (pos[input - 1] == 'X' || pos[input - 1] == 'O');

            pos[input - 1] = turn;
            System.out.println("\n " + pos[6] + " | " + pos[7] + " | " + pos[8] + " ");
            System.out.println("---+---+---");
            System.out.println(" " + pos[3] + " | " + pos[4] + " | " + pos[5] + " ");
            System.out.println("---+---+---");
            System.out.println(" " + pos[0] + " | " + pos[1] + " | " + pos[2] + " \n");

            if (pos[0] == turn && pos[1] == turn && pos[2] == turn
                    || pos[3] == turn && pos[4] == turn && pos[5] == turn
                    || pos[6] == turn && pos[7] == turn && pos[8] == turn
                    || pos[0] == turn && pos[3] == turn && pos[6] == turn
                    || pos[1] == turn && pos[4] == turn && pos[7] == turn
                    || pos[2] == turn && pos[5] == turn && pos[8] == turn
                    || pos[0] == turn && pos[4] == turn && pos[8] == turn
                    || pos[2] == turn && pos[4] == turn && pos[6] == turn
            ){
                System.out.println(turn + " is the winner!!!");
                break;

            }

                if (turn == 'X')
                    turn = 'O';
                else
                    turn = 'X';

                currentTurn++;

                if(currentTurn > 9){
                    System.out.println("Draw! No one is the winner! Bye");
                    break;
                }
        }

    }


}