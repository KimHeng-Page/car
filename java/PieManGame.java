import java.util.Scanner;

public class PieManGame {

    static char[][] map = {
            {'#','#','#','#','#','#','#'},
            {'#','P','*',' ','*',' ','#'},
            {'#',' ','#',' ','#',' ','#'},
            {'#','*',' ','*',' ','*','#'},
            {'#','#','#','#','#','#','#'}
    };

    static int playerRow = 1;
    static int playerCol = 1;
    static int score = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            printMap();
            System.out.println("Score: " + score);
            System.out.print("Move (W A S D, Q to quit): ");

            char move = sc.next().toUpperCase().charAt(0);

            if (move == 'Q') {
                System.out.println("Game Over 👋");
                break;
            }

            movePlayer(move);

            if (checkWin()) {
                printMap();
                System.out.println("🎉 YOU WIN! Score: " + score);
                break;
            }
        }

        sc.close();
    }

    static void printMap() {
        for (char[] row : map) {
            for (char col : row) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

    static void movePlayer(char direction) {
        int newRow = playerRow;
        int newCol = playerCol;

        switch (direction) {
            case 'W': newRow--; break;
            case 'S': newRow++; break;
            case 'A': newCol--; break;
            case 'D': newCol++; break;
            default: return;
        }

        if (map[newRow][newCol] != '#') {
            if (map[newRow][newCol] == '*') {
                score++;
            }

            map[playerRow][playerCol] = ' ';
            playerRow = newRow;
            playerCol = newCol;
            map[playerRow][playerCol] = 'P';
        }
    }

    static boolean checkWin() {
        for (char[] row : map) {
            for (char col : row) {
                if (col == '*') {
                    return false;
                }
            }
        }
        return true;
    }
}
