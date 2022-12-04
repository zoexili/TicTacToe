import java.util.Scanner;

public class Orderchaos extends Board {
    // static int count;
    int scorePlayerOrder;
    int scorePlayerChaos;

    public Orderchaos(int n) {
        super(n);
    }

    public boolean gameOver(Orderchaos g) {
        boolean gameOver = false;
        for (int i = 0; i < board.length; i++) {
            gameOver = checkRow(i);
            if (gameOver) {
                System.out.println("Player Order wins!");
                g.scorePlayerOrder += 1;
                break;
            }
            gameOver = checkCol(i);
            if (gameOver) {
                System.out.println("Player Order wins!");
                g.scorePlayerOrder += 1;
                break;
            }
            gameOver = checkLeftDiagonals();
            if (gameOver) {
                System.out.println("Player Order wins!");
                g.scorePlayerOrder += 1;
                break;
            }
            gameOver = checkRightDiagonals();
            if (gameOver) {
                System.out.println("Player Order wins!");
                g.scorePlayerOrder += 1;
                break;
            }
            if (count == g.size()) { // chaos wins
                System.out.println("Player Chaos wins!");
                g.scorePlayerChaos += 1;
                gameOver = true;
                break;
            }
        }
        return gameOver;
    }

    public boolean checkRow(int row) {
        boolean check1 = true;
        boolean check2 = true;
        for (int i = 0; i < board.length - 1; i++) { // row 0 - 4
            if (board[row][i].equals(" ")) { // the 5th cell can be " ".
                check1 = false;
            }
            if ((i != 0) && !board[row][i - 1].equals(board[row][i])) {
                check1 = false;
            }
        }
        for (int i = 1; i < board.length; i++) { // row 1 - 5
            if (board[row][i].equals(" ")) {  // the 1st cell can " ".
                check2 = false;
            }
            if ((i != 5) && !board[row][i].equals(board[row][i + 1])) {
                check2 = false;
            }
        }
        return (check1 || check2);
    }

    public boolean checkCol(int col) {
        boolean check1 = true;
        boolean check2 = true;
        for (int i = 0; i < board.length - 1; i++) { // col 0 - 4
            if (board[i][col].equals(" ")) {
                check1 = false;
            }
            if ((i != 0) && !board[i - 1][col].equals(board[i][col])) {
                check1 = false;
            }
        }
        for (int i = 1; i < board.length; i++) { // col 1 - 5
            if (board[i][col].equals(" ")) {
                check2 = false;
            }
            if ((i != 5) && !board[i][col].equals(board[i + 1][col])) {
                check2 = false;
            }
        }
        return (check1 || check2);
    }

    public boolean checkLeftDiagonals() {
        if ((board[0][0].equals(board[1][1])) && (board[1][1].equals(board[2][2])) && (board[2][2].
                equals(board[3][3])) && (board[3][3].equals(board[4][4])) && (!board[0][0].equals(" "))) {
            return true;
        } else if ((board[1][1].equals(board[2][2])) && (board[2][2].equals(board[3][3]))
                && (board[3][3].equals(board[4][4])) && (board[4][4].equals(board[5][5])) &&
                (!board[1][1].equals(" "))) {
            return true;
        } else if ((board[0][1].equals(board[1][2])) && (board[1][2].equals(board[2][3])) &&
                (board[2][3].equals(board[3][4])) && (board[3][4].equals(board[4][5])) &&
                (!board[0][1].equals(" "))) {
            return true;
        } else if ((board[1][0].equals(board[2][1])) && (board[2][1].equals(board[3][2])) &&
                (board[3][2].equals(board[4][3])) && (board[4][3].equals(board[5][4])) &&
                (!board[1][0].equals(" "))) {
            return true;
        }
        return false;
    }

    public boolean checkRightDiagonals() {
        if ((board[0][5].equals(board[1][4])) && (board[1][4].equals(board[2][3]))
                && (board[2][3].equals(board[3][2])) && (board[3][2].equals(board[4][1]))
                && (!board[0][5].equals(" "))) {
            return true;
        } else if ((board[1][4].equals(board[2][3])) && (board[2][3].equals(board[3][2]))
                && (board[3][2].equals(board[4][1])) && (board[4][1].equals(board[5][0])) &&
                (!board[1][4].equals(" "))) {
            return true;
        } else if ((board[0][4].equals(board[1][3])) && (board[1][3].equals(board[2][2])) &&
                (board[2][2].equals(board[3][1])) && (board[3][1].equals(board[4][0])) &&
                (!board[0][4].equals(" "))) {
            return true;
        } else if ((board[1][5].equals(board[2][4])) && (board[2][4].equals(board[3][3]))
                && (board[3][3].equals(board[4][2])) && (board[4][2].equals(board[5][1])) &&
                (!board[1][5].equals(" "))) {
        }
        return false;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to Order and Chaos! You will play on a 6*6 chess board.");
        Orderchaos g = new Orderchaos(6);
        System.out.println(g.toString());
        boolean over = false; // initialize to false
        while (over == false) {
            System.out.println("Player Order Enter your move: ");
            int w = scan.nextInt();
            if (w > board.length) {
                System.out.println("Please choose to place your chess within the board range: 6 * 6");
                w = scan.nextInt();
            }
            int h = scan.nextInt();
            if (h > board.length) {
                System.out.println("Please choose to place your chess within the board range: 6 * 6");
                h = scan.nextInt();
            }
            String s = scan.next();
            if (!s.equals("O") && (!s.equals("X"))) {
                System.out.println("Please only use chess piece O or X.");
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
                        System.out.println("Please choose to place your chess within the board range: 6 * 6");
                        w = scan.nextInt();
                    }
                    h = scan.nextInt();
                    if (h > board.length) {
                        System.out.println("Please choose to place your chess within the board range: 6 * 6");
                        h = scan.nextInt();
                    }
                    s = scan.next();
                    if (!s.equals("O") && (!s.equals("X"))) {
                        System.out.println("Please only use chess piece O or X.");
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
                g.scorePlayerOrder += 1;
                Scanner reply = new Scanner(System.in);
                System.out.println("Would you like to play again? Enter Y/y to play again or any other key to exit.");
                s = reply.nextLine().toLowerCase();
                if (s.equals("y")) {
                    g.reset();
                    over = false;
                    continue;
                } else {
                    System.out.println("Exit game...\nScore summary:");
                    System.out.println("Player Order Score: " + g.scorePlayerOrder);
                    System.out.println("Player Chaos Score: " + g.scorePlayerChaos);
                    break;
                }
            }
            System.out.println("Player Chaos Enter your move: ");
            w = scan.nextInt();
            if (w > board.length) {
                System.out.println("Please choose to place your chess within the board range: 6 * 6");
                w = scan.nextInt();
            }
            h = scan.nextInt();
            if (h > board.length) {
                System.out.println("Please choose to place your chess within the board range: 6 * 6");
                h = scan.nextInt();
            }
            s = scan.next();
            if (!s.equals("O") && (!s.equals("X"))) {
                System.out.println("Please only use chess piece O or X.");
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
                        System.out.println("Please choose to place your chess within the board range: 6 * 6");
                        w = scan.nextInt();
                    }
                    h = scan.nextInt();
                    if (h > board.length) {
                        System.out.println("Please choose to place your chess within the board range: 6 * 6");
                        h = scan.nextInt();
                    }
                    s = scan.next();
                    if (!s.equals("O") && (!s.equals("X"))) {
                        System.out.println("Please only use chess piece O or X.");
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
                    over = false;
                    continue;
                } else {
                    System.out.println("Exit game...\nScore summary:");
                    System.out.println("Player Order Score: " + g.scorePlayerOrder);
                    System.out.println("Player Chaos Score: " + g.scorePlayerChaos);
                    break;
                }
            }
        }
    }
}

