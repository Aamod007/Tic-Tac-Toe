Introduction
This is a simple console-based implementation of the classic Tic Tac Toe game in Java. Two players can play this game, taking turns to enter their moves. The game board is represented by a 3x3 grid, and players can choose their moves by entering the slot number corresponding to the grid position.

Features
Two-player mode (X and O)
Input validation to ensure valid moves
Detection of win conditions and draw situations
Simple and clear console output to display the game board
How to Play
The game starts with player "X".
Players take turns to enter a slot number (1-9) to place their marker (X or O) on the board.
The game checks for a winner after each move. A player wins if they get three of their markers in a row, column, or diagonal.
The game ends when there is a winner or the board is full, resulting in a draw.
Running the Game
Ensure you have Java installed on your computer.
Copy the provided source code into a file named TTT.java.
Open a terminal or command prompt and navigate to the directory containing TTT.java.
Compile the code using the following command:
bash
Copy code
javac TTT.java
Run the compiled code using the following command:
bash
Copy code
java TTT
