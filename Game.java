import java.util.Scanner;

public class Game extends Board {
    // static int count;
    int scorePlayerO;
    int scorePlayerX;
    int scoreStalemate;

    public Game(int n) {
        super(n);
        count = 0;
        this.scorePlayerO = 0;
        this.scorePlayerX = 0;
    }

    public boolean gameOver(Game g) {
        boolean gameOver = false;
        String[][] b = board;
        for (int i = 0; i < b.length; i++) {
            gameOver = checkRow(i);
            if (gameOver) {
                break;
            }
            gameOver = checkCol(i);
            if (gameOver) {
                break;
            }
            gameOver = checkLeftDiagonal();
            if (gameOver) {
                break;
            }
            gameOver = checkRightDiagonal();
            if (gameOver) {
                break;
            }
            if (count == g.size()) { // stalemate
                System.out.println("Stalemate!");
                scoreStalemate += 1;
                break;
            }
        }
        return gameOver;
    }

    public boolean checkRow(int row) {
        boolean gameOver = false;
        for (int i = 1; i < board.length; i++) {
            if (!board[row][i].equals(board[row][i - 1])) {
                break;
            }
            if (i == board.length - 1 && board[row][i].equals("O")) {
                System.out.println("Player O wins!");
                scorePlayerO += 1;
                gameOver = true;
            } else if (i == board.length - 1 && board[row][i].equals("X")) {
                System.out.println("Player X wins!");
                scorePlayerX += 1;
                gameOver = true;
            }
        }
        return gameOver;
    }

    public boolean checkCol(int col) {
        boolean gameOver = false;
        for (int i = 1; i < board.length; i++) {
            if (!board[i][col].equals(board[i - 1][col])) {
                break;
            }
            if (i == board.length - 1 && board[i][col].equals("O")) {
                System.out.println("Player O wins!");
                scorePlayerO += 1;
                gameOver = true;
            } else if (i == board.length - 1 && board[i][col].equals("X")) {
                System.out.println("Player X wins!");
                scorePlayerX += 1;
                gameOver = true;
            }
        }
        return gameOver;
    }

    public boolean checkLeftDiagonal() {
        // boolean gameOver = false;
        for (int i = 1; i < board.length; i++) {
            if (board[i - 1][i - 1].equals(" ") || board[i][i].equals(" ")) {
                return false;
            }
            if (!board[i][i].equals(board[i - 1][i - 1])) {
                return false;
            }
            if (i == board.length - 1 && board[i][i].equals("O")) {
                System.out.println("Player O wins!");
                scorePlayerO += 1;
                return true;
            } else if (i == board.length - 1 && board[i][i].equals("X")) {
                System.out.println("Player X wins!");
                scorePlayerX += 1;
                return true;
            }
        }
        return true;
    }

    public boolean checkRightDiagonal() {
//        boolean gameOver = false;
        for (int i = 1; i < board.length; i++) {
            if (board[board.length - i][i - 1].equals(" ") || board[board.length - 1 - i][i].equals(" ")) {
                return false;
            }
            if (!board[board.length - 1 - i][i].equals(board[board.length - i][i - 1])) {
                return false;
            }
            if (i == board.length - 1 && board[board.length - i][i - 1].equals("O")) {
                System.out.println("Player O wins!");
                scorePlayerO += 1;
                return true;
            } else if (i == board.length - 1 && board[board.length - i][i - 1].equals("X")) {
                System.out.println("Player X wins!");
                scorePlayerX += 1;
                return true;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to Tic Tac Toe!");
        System.out.println("What's the size of the board you would like to play?");
        int n = scan.nextInt();
        if (n > 10) {
            System.out.println("Please choose a board size <= 10 * 10.");
            n = scan.nextInt();
        }
        Game g = new Game(n);
        System.out.println(g.toString());
        boolean over = false; // initialize to false
        while (over == false) {
            System.out.println("Player O Enter your move: ");
            int w = scan.nextInt();
            if (w > board.length) {
                System.out.println("Please choose to place your chess within the board range: " + n + " * " + n);
                w = scan.nextInt();
            }
            int h = scan.nextInt();
            if (h > board.length) {
                System.out.println("Please choose to place your chess within the board range: " + n + " * " + n);
                h = scan.nextInt();
            }
            String s = scan.next();
            if (!s.equals("O")) {
                System.out.println("Please only use chess piece O.");
                continue;
            }
            if (board[w][h].equals(" ")) {
                g.PlayerTurn(w, h, s);
            } else {
                while (!board[w][h].equals(" ")) {
                    System.out.println("This unit is occupied. Please choose a new unit to play");
                    System.out.println("Player O Enter your move: ");
                    w = scan.nextInt();
                    if (w > board.length) {
                        System.out.println("Please choose to place your chess within the board range: " + n + " * " + n);
                        w = scan.nextInt();
                    }
                    h = scan.nextInt();
                    if (h > board.length) {
                        System.out.println("Please choose to place your chess within the board range: " + n + " * " + n);
                        h = scan.nextInt();
                    }
                    s = scan.next();
                    if (!s.equals("O")) {
                        System.out.println("Please only use chess piece O.");
                        continue;
                    }
                    if (board[w][h].equals(" ")) {
                        g.PlayerTurn(w, h, s);
                        break;
                    }
                }
            }
            System.out.println(g.toString());
            over = g.gameOver(g);
            if (over == true) {
                Scanner reply = new Scanner(System.in);
                System.out.println("Would you like to play again? Enter Y/y to play again or any other key to exit.");
                s = reply.nextLine().toLowerCase();
                if (s.equals("y")) {
                    g.reset();
                    System.out.println(g.toString());
                    over = false;
                    continue;
                } else {
                    System.out.println("Exit game...\nScore summary:");
                    System.out.println("Player O Score: " + g.scorePlayerO);
                    System.out.println("Player X Score: " + g.scorePlayerX);
                    System.out.println("Number of Stalemates: " + g.scoreStalemate);
                    break;
                }
            }
            System.out.println("Player X Enter your move: ");
            w = scan.nextInt();
            if (w > board.length) {
                System.out.println("Please choose to place your chess within the board range: " + n + " * " + n);
                w = scan.nextInt();
            }
            h = scan.nextInt();
            if (h > board.length) {
                System.out.println("Please choose to place your chess within the board range: " + n + " * " + n);
                h = scan.nextInt();
            }
            s = scan.next();
            if (!s.equals("X")) {
                System.out.println("Please only use chess piece X.");
                continue;
            }
            if (board[w][h].equals(" ")) {
                g.PlayerTurn(w, h, s);
            } else {
                while (!board[w][h].equals(" ")) {
                    System.out.println("This unit is occupied. Please choose a new unit to play");
                    System.out.println("Player X Enter your move: ");
                    w = scan.nextInt();
                    if (w > board.length) {
                        System.out.println("Please choose to place your chess within the board range: " + n + " * " + n);
                        w = scan.nextInt();
                    }
                    h = scan.nextInt();
                    if (h > board.length) {
                        System.out.println("Please choose to place your chess within the board range: " + n + " * " + n);
                        h = scan.nextInt();
                    }
                    s = scan.next();
                    if (!s.equals("X")) {
                        System.out.println("Please only use chess piece X.");
                        continue;
                    }
                    if (board[w][h].equals(" ")) {
                        g.PlayerTurn(w, h, s);
                        break;
                    }
                }
            }
            System.out.println(g.toString());
            over = g.gameOver(g);
            if (over == true) {
                Scanner reply = new Scanner(System.in);
                System.out.println("Would you like to play again? Enter Y/y to play again or any other key to exit.");
                s = reply.nextLine().toLowerCase();
                if (s.equals("y")) {
                    g.reset();
                    System.out.println(g.toString());
                    over = false;
                    continue;
                } else {
                    System.out.println("Exit game...\nScore summary:");
                    System.out.println("Player O Score: " + g.scorePlayerO);
                    System.out.println("Player X Score: " + g.scorePlayerX);
                    System.out.println("Number of Stalemates: " + g.scoreStalemate);
                    break;
                }
            }
        }
    }
}
