import java.util.Scanner;

public class Battleship {
    static String player1;
    static String player2;
    static Scanner scanner = new Scanner(System.in);
    static int[][] battlefield1 = new int[10][10];
    static int[][] battlefield2 = new int[10][10];

    public static void main(String[] args) {


    }

    public static void drawField() {

        int deck = 4;
        while (){
        System.out.println();
        System.out.println(player1 + "plz place your 4-deck ship on the battlefield");
        System.out.println("  0 1 2 3 4 5 6 7 8 9");
        for (int i = 0; i < 10; i++) {
            System.out.println(i + " - - - - - - - - - -");
        }
            System.out.println("Plz enter OX coordinate: ");
            int x = scanner.nextInt();
            System.out.println("Plz enter OY coordinate: ");
            int y = scanner.nextInt();
            System.out.println("Plz choose direction");
            System.out.println("1. Vertical");
            System.out.println("2. Horizontal");
            int direction = scanner.nextInt();
            battlefield1[x][y] = 1;
            if (direction == 1) {
                battlefield1[x][y + 1] = 1;
                battlefield1[x][y + 2] = 1;
                battlefield1[x][y + 3] = 1;
            } else {
                battlefield1[x + 1][y] = 1;
                battlefield1[x + 2][y] = 1;
                battlefield1[x + 3][y] = 1;
            }
            for (int i = 0; i < battlefield1.length; i++) {
                for (int j = 0; j < battlefield1.length; j++) {

                }
            }
        }


}