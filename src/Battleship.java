import java.util.Scanner;

public class Battleship {
    static String playerName1;
    static String playerName2;
    static Scanner scanner = new Scanner(System.in);
    static int[][] battlefield1 = new int[10][10];
    static int[][] battlefield2 = new int[10][10];
    static int[][] monitor1 = new int[10][10];
    static int[][] monitor2 = new int[10][10];

    public static void main(String[] args) {
        placeShips(playerName1, battlefield1);
        placeShips(playerName2, battlefield2);
        makeTurn(playerName1, monitor1);
        makeTurn(playerName2, monitor2);

    }

    public static void placeShips(String playerName, int[][] battlefield) {

        int deck = 4;
        while (deck >= 1) {
            System.out.println();
            System.out.println(playerName + "plz place your " + deck + "-deck ship on the battlefield");
            drawField(battlefield);

            System.out.println("Plz enter OX coordinate: ");
            int x = scanner.nextInt();
            System.out.println("Plz enter OY coordinate: ");
            int y = scanner.nextInt();
            System.out.println("Plz choose direction");
            System.out.println("1. Vertical");
            System.out.println("2. Horizontal");
            int direction = scanner.nextInt();

            for (int i = 0; i < deck; i++) {
                if (direction == 1) {
                    battlefield[x][y + i] = 1;
                } else battlefield[x + i][y] = 1;
            }
            deck--;
        }


    }

    public static void drawField(int[][] battlefield) {
        System.out.println("  0 1 2 3 4 5 6 7 8 9");
        for (int i = 0; i < battlefield.length; i++) {
            System.out.print(i + " ");
            for (int j = 0; j < battlefield[1].length; j++) {
                if (battlefield[j][i] == 0) {
                    System.out.print("- ");
                } else {
                    System.out.print("X ");
                }

            }
            System.out.println();
        }

    }

    public static void makeTurn(String playerName, int[][] monitor, int[][] battlefield) {
        System.out.println(playerName + ", make your turn.");
        System.out.println("  0 1 2 3 4 5 6 7 8 9");
        for (int i = 0; i < monitor.length; i++) {
            System.out.print(i + " ");
            for (int j = 0; j < monitor[1].length; j++) {
                if (monitor[j][i] == 0) {
                    System.out.print("- ");
                } else if (monitor[j][i] == 1) {
                    System.out.print(". ");
                } else {
                    System.out.print("X ");
                }

            }
            System.out.println();
        }
        System.out.println("Plz enter OX coordinate: ");
        int x = scanner.nextInt();
        System.out.println("Plz enter OY coordinate: ");
        int y = scanner.nextInt();
        if (battlefield[x][y] == 1) {
            System.out.println("Hit!");
        } else {

        }

    }
}


