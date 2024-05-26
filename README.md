# Tic Tac Toe in Java

This is a simple implementation of the classic Tic Tac Toe game in Java. The game is played on a 3x3 grid and is designed for two players, X and O.

## Features

- Two-player game
- Simple text-based user interface
- Checks for win conditions and draws

## How to Play

1. Clone the repository:
    ```sh
    git clone https://github.com/Aamod007/tictactoe-java.git
    ```
2. Navigate to the project directory:
    ```sh
    cd tictactoe-java
    ```
3. Compile the Java program:
    ```sh
    javac TTT.java
    ```
4. Run the Java program:
    ```sh
    java TTT
    ```

## Gameplay Instructions

- The game will prompt the first player (X) to enter a slot number to place their marker.
- Players take turns entering a slot number to place their marker (X or O) on the board.
- The game will display the board after each move.
- The game checks for win conditions after each turn.
- If a player wins, a congratulatory message is displayed.
- If all slots are filled and there is no winner, the game declares a draw.

## Example

Welcome to 3x3 Tic Tac Toe.
|---|---|---|
| 1 | 2 | 3 |
|-----------|
| 4 | 5 | 6 |
|-----------|

7	8	9
X will play first. Enter a slot number to place X in:		
1		
---	---	---
X	2	3
-----------		
4	5	6
-----------		
7	8	9
O's turn; enter a slot number to place O in:		
5		
---	---	---
X	2	3
-----------		
4	O	6
-----------		
7	8	9


## Code Overview

- `TTT` class: Contains the main method and game logic.
  - `checkWinner` method: Checks for winning conditions and declares the winner or a draw.
  - `printBoard` method: Prints the current state of the board.
  - `main` method: Initializes the game, handles user input, and controls the game flow.

## Contributing

Feel free to fork this repository and contribute by submitting pull requests. For major changes, please open an issue first to discuss what you would like to change.

## License

This project is licensed under the MIT License.
