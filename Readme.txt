# CS611-<Assignment 1>
## <Assignment Tic-tac-toe and OrderandChaos>
---------------------------------------------------------------------------
<Student Name: Li Xi>
<Student Email: lxi@bu.edu>
<Student BUID: U68710477>

## Files
---------------------------------------------------------------------------
<A brief description of each file and what it does>
Board.java: Board object and its basic functions.
Game.java: Unique Tic Tac Toe game rule logic that extends from the Board object.
Orderchaos.java: Order and Chaos game rule logic that extends from the Board object.


## How to compile and run
---------------------------------------------------------------------------
1. Download the java files into a new folder.
2. Run the following instructions:
// javac *.java
javac Board.java
javac Game.java
javac Orderchaos.java
java Board
// This command below executes Tic Tac Toe
java Game
// This command below executes Order and Chaos
java Orderchaos


## Input/Output Example
---------------------------------------------------------------------------
<Place here an example of how the program runs. Include both its
outputs and correctly formatted inputs. Please clearly mark the inputs.>

Here is an example of running my Tic Tac Toe program: (All the inputs are marked with --")
Tic Tac Toe:
Welcome to Tic Tac Toe!
What's the size of the board you would like to play?
--input
3 (In this example, input is 3).

+--+--+--+
|  |  |  |
+--+--+--+
|  |  |  |
+--+--+--+
|  |  |  |
+--+--+--+
Player O Enter your move:
--input
0 0 O (Here, first input is row, second input is column, and the third input is chess piece O.)
+--+--+--+
|O |  |  |
+--+--+--+
|  |  |  |
+--+--+--+
|  |  |  |
+--+--+--+
Player X Enter your move:
--input
1 0 X
+--+--+--+
|O |  |  |
+--+--+--+
|X |  |  |
+--+--+--+
|  |  |  |
+--+--+--+
Player O Enter your move:
--input
0 1 O
+--+--+--+
|O |O |  |
+--+--+--+
|X |  |  |
+--+--+--+
|  |  |  |
+--+--+--+
Player X Enter your move:
--input
2 0 X
+--+--+--+
|O |O |  |
+--+--+--+
|X |  |  |
+--+--+--+
|X |  |  |
+--+--+--+
Player O Enter your move:
--input
0 2 O
+--+--+--+
|O |O |O |
+--+--+--+
|X |  |  |
+--+--+--+
|X |  |  |
+--+--+--+
Player O wins!
Enter Y/y to restart the program and any other key to exit.
--input
y
+--+--+--+
|  |  |  |
+--+--+--+
|  |  |  |
+--+--+--+
|  |  |  |
+--+--+--+
Player O Enter your move:
--input
0 0 O
+--+--+--+
|O |  |  |
+--+--+--+
|  |  |  |
+--+--+--+
|  |  |  |
+--+--+--+
Player X Enter your move:
--input
1 0 X
+--+--+--+
|O |  |  |
+--+--+--+
|X |  |  |
+--+--+--+
|  |  |  |
+--+--+--+
Player O Enter your move:
--input
2 0 O
+--+--+--+
|O |  |  |
+--+--+--+
|X |  |  |
+--+--+--+
|O |  |  |
+--+--+--+
Player X Enter your move:
--input
1 1 X
+--+--+--+
|O |  |  |
+--+--+--+
|X |X |  |
+--+--+--+
|O |  |  |
+--+--+--+
Player O Enter your move:
--input
0 2 O
+--+--+--+
|O |  |O |
+--+--+--+
|X |X |  |
+--+--+--+
|O |  |  |
+--+--+--+
Player X Enter your move:
--input
1 2 X
+--+--+--+
|O |  |O |
+--+--+--+
|X |X |X |
+--+--+--+
|O |  |  |
+--+--+--+
Player X wins!
Enter Y/y to restart the program and any other key to exit.

Exit game...
Score summary:
Player O Score: 1
Player X Score: 1
Number of Stalemates: 0

------------------------------------------------------------
Here is an example running my Order and Chaos Program.


Welcome to Order and Chaos! You will play on a 6*6 chess board.
+--+--+--+--+--+--+
|  |  |  |  |  |  |
+--+--+--+--+--+--+
|  |  |  |  |  |  |
+--+--+--+--+--+--+
|  |  |  |  |  |  |
+--+--+--+--+--+--+
|  |  |  |  |  |  |
+--+--+--+--+--+--+
|  |  |  |  |  |  |
+--+--+--+--+--+--+
|  |  |  |  |  |  |
+--+--+--+--+--+--+
Player Order Enter your move:
0 0 O
+--+--+--+--+--+--+
|O |  |  |  |  |  |
+--+--+--+--+--+--+
|  |  |  |  |  |  |
+--+--+--+--+--+--+
|  |  |  |  |  |  |
+--+--+--+--+--+--+
|  |  |  |  |  |  |
+--+--+--+--+--+--+
|  |  |  |  |  |  |
+--+--+--+--+--+--+
|  |  |  |  |  |  |
+--+--+--+--+--+--+
Player Chaos Enter your move:
1 0 X
+--+--+--+--+--+--+
|O |  |  |  |  |  |
+--+--+--+--+--+--+
|X |  |  |  |  |  |
+--+--+--+--+--+--+
|  |  |  |  |  |  |
+--+--+--+--+--+--+
|  |  |  |  |  |  |
+--+--+--+--+--+--+
|  |  |  |  |  |  |
+--+--+--+--+--+--+
|  |  |  |  |  |  |
+--+--+--+--+--+--+
Player Order Enter your move:
0 1 O
+--+--+--+--+--+--+
|O |O |  |  |  |  |
+--+--+--+--+--+--+
|X |  |  |  |  |  |
+--+--+--+--+--+--+
|  |  |  |  |  |  |
+--+--+--+--+--+--+
|  |  |  |  |  |  |
+--+--+--+--+--+--+
|  |  |  |  |  |  |
+--+--+--+--+--+--+
|  |  |  |  |  |  |
+--+--+--+--+--+--+
Player Chaos Enter your move:
1 1 X
+--+--+--+--+--+--+
|O |O |  |  |  |  |
+--+--+--+--+--+--+
|X |X |  |  |  |  |
+--+--+--+--+--+--+
|  |  |  |  |  |  |
+--+--+--+--+--+--+
|  |  |  |  |  |  |
+--+--+--+--+--+--+
|  |  |  |  |  |  |
+--+--+--+--+--+--+
|  |  |  |  |  |  |
+--+--+--+--+--+--+
Player Order Enter your move:
0 2 O
+--+--+--+--+--+--+
|O |O |O |  |  |  |
+--+--+--+--+--+--+
|X |X |  |  |  |  |
+--+--+--+--+--+--+
|  |  |  |  |  |  |
+--+--+--+--+--+--+
|  |  |  |  |  |  |
+--+--+--+--+--+--+
|  |  |  |  |  |  |
+--+--+--+--+--+--+
|  |  |  |  |  |  |
+--+--+--+--+--+--+
Player Chaos Enter your move:
1 2 X
+--+--+--+--+--+--+
|O |O |O |  |  |  |
+--+--+--+--+--+--+
|X |X |X |  |  |  |
+--+--+--+--+--+--+
|  |  |  |  |  |  |
+--+--+--+--+--+--+
|  |  |  |  |  |  |
+--+--+--+--+--+--+
|  |  |  |  |  |  |
+--+--+--+--+--+--+
|  |  |  |  |  |  |
+--+--+--+--+--+--+
Player Order Enter your move:
0 3 O
+--+--+--+--+--+--+
|O |O |O |O |  |  |
+--+--+--+--+--+--+
|X |X |X |  |  |  |
+--+--+--+--+--+--+
|  |  |  |  |  |  |
+--+--+--+--+--+--+
|  |  |  |  |  |  |
+--+--+--+--+--+--+
|  |  |  |  |  |  |
+--+--+--+--+--+--+
|  |  |  |  |  |  |
+--+--+--+--+--+--+
Player Chaos Enter your move:
1 3 X
+--+--+--+--+--+--+
|O |O |O |O |  |  |
+--+--+--+--+--+--+
|X |X |X |X |  |  |
+--+--+--+--+--+--+
|  |  |  |  |  |  |
+--+--+--+--+--+--+
|  |  |  |  |  |  |
+--+--+--+--+--+--+
|  |  |  |  |  |  |
+--+--+--+--+--+--+
|  |  |  |  |  |  |
+--+--+--+--+--+--+
Player Order Enter your move:
0 4 O
+--+--+--+--+--+--+
|O |O |O |O |O |  |
+--+--+--+--+--+--+
|X |X |X |X |  |  |
+--+--+--+--+--+--+
|  |  |  |  |  |  |
+--+--+--+--+--+--+
|  |  |  |  |  |  |
+--+--+--+--+--+--+
|  |  |  |  |  |  |
+--+--+--+--+--+--+
|  |  |  |  |  |  |
+--+--+--+--+--+--+
Player Order wins!
Would you like to play again? Enter Y/y to play again or any other key to exit.


