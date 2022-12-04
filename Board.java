import java.util.Arrays;

public class Board {
    static String[][] board;
    static int count;

    public Board(int n) {
        board = new String[n][n];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++)
                board[i][j] = " ";
        }
    }

    public int size() {
        return board.length * board.length;
    }

    public void PlayerTurn(int w, int h, String s) {
        if (board[w][h].equals(" ")) {
            board[w][h] = s;
            count += 1;
        }
    }

    public void reset() {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++)
                board[i][j] = " ";
        }
        count = 0;
    }

    public boolean equals(Board that) {
        return (that != null && this.board == that.board &&
                this.size() == that.size());
    }

    public String toString() {
        String decoration = new String(new char[board.length]).replace("\0", "+--");
        String s = "";
        for (int i = 0; i < board.length; i++) {
            String ss = decoration + "+\n" + Arrays.toString(board[i]).replace("[", "|").
                    replace("]", " |\n").replace(", ", " |");
            s += ss;
        }
        s = s + decoration + "+";
        return (s);
    }

    public static void main(String[] args) {
        Board b;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.println(board[i][j]);
            }
        }
    }
}

