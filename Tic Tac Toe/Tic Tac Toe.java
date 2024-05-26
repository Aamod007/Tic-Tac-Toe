import java.util.*;

public class TTT {
    
    // Board array to store the current state of the game
    static String[] board;
    // Variable to keep track of whose turn it is ("X" or "O")
    static String turn;
    
    // Method to check for a winner
    static String checkWinner() {
        // There are 8 possible ways to win (3 rows, 3 columns, 2 diagonals)
        for (int a = 0; a < 8; a++) {
            String line = null;
            
            switch (a) {
                case 0:
                    line = board[0] + board[1] + board[2]; // Top row
                    break;
                case 1:
                    line = board[3] + board[4] + board[5]; // Middle row
                    break;
                case 2:
                    line = board[6] + board[7] + board[8]; // Bottom row
                    break;
                case 3:
                    line = board[0] + board[3] + board[6]; // Left column
                    break;
                case 4:
                    line = board[1] + board[4] + board[7]; // Middle column
                    break;
                case 5:
                    line = board[2] + board[5] + board[8]; // Right column
                    break;
                case 6:
                    line = board[0] + board[4] + board[8]; // Left diagonal
                    break;
                case 7:
                    line = board[2] + board[4] + board[6]; // Right diagonal
                    break;
            }
            // Check if 'X' has won
            if (line.equals("XXX")) {
                return "X";
            }
            // Check if 'O' has won
            else if (line.equals("OOO")) {
                return "O";
            }
        }
        
        // Check if there are still moves left on the board
        for (int a = 0; a < 9; a++) {
            if (Arrays.asList(board).contains(String.valueOf(a + 1))) {
                break;
            } else if (a == 8) {
                // If no moves left and no winner, it's a draw
                return "draw";
            }
        }

        // Ask the current player to enter their move
        System.out.println(turn + "'s turn; enter a slot number to place " + turn + " in:");
        return null;
    }
    
    // Method to print the current state of the board
    static void printBoard() {
        System.out.println("|---|---|---|");
        System.out.println("| " + board[0] + " | " + board[1] + " | " + board[2] + " |");
        System.out.println("|-----------|");
        System.out.println("| " + board[3] + " | " + board[4] + " | " + board[5] + " |");
        System.out.println("|-----------|");
        System.out.println("| " + board[6] + " | " + board[7] + " | " + board[8] + " |");
        System.out.println("|---|---|---|");
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        board = new String[9];
        turn = "X";
        String winner = null;

        // Initialize the board with numbers 1 to 9
        for (int a = 0; a < 9; a++) {
            board[a] = String.valueOf(a + 1);
        }

        // Welcome message and initial board display
        System.out.println("Welcome to 3x3 Tic Tac Toe.");
        printBoard();
        System.out.println("X will play first. Enter a slot number to place X in:");

        while (winner == null) {
            int numInput;

            // Exception handling to ensure valid input from user
            try {
                numInput = in.nextInt();
                if (!(numInput > 0 && numInput <= 9)) {
                    System.out.println("Invalid input; re-enter slot number:");
                    continue;
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input; re-enter slot number:");
                in.next(); // Clear the invalid input
                continue;
            }

            // Place the move if the chosen slot is valid
            if (board[numInput - 1].equals(String.valueOf(numInput))) {
                board[numInput - 1] = turn;

                // Switch turn between "X" and "O"
                if (turn.equals("X")) {
                    turn = "O";
                } else {
                    turn = "X";
                }

                // Print the updated board and check for a winner
                printBoard();
                winner = checkWinner();
            } else {
                System.out.println("Slot already taken; re-enter slot number:");
            }
        }

        // Display the result of the game
        if (winner.equalsIgnoreCase("draw")) {
            System.out.println("It's a draw! Thanks for playing.");
        } else {
            System.out.println("Congratulations! " + winner + "'s have won! Thanks for playing.");
        }
    }
}
