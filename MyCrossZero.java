import java.util.Random;
import java.util.Scanner;

public class MyCrossZero {
    public static int size = 5;
    public static char[][] map;
    public static char dot_empty = '.';
    public static char dot_x = 'x';
    public static char dot_o = '0';
    public static Scanner sc = new Scanner(System.in);
    public static Random rand = new Random();

    public static void main(String[] args) {
        initMap();
        printMap();
        while (true) {
            humanTurn();
            printMap();
            if (checkWin(dot_x)) {
                System.out.println("Победил человек");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }
            aiTurn();
            printMap();
            if (checkWin(dot_o)) {
                System.out.println("Победил Искуственный Интеллект");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }
        }
        System.out.println("Игра закончена");
    }

    public static void initMap() {
        map = new char[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                map[i][j] = dot_empty;
            }
        }
    }

    public static void printMap() {
        for (int i = 0; i <= size; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < size; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < size; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void humanTurn() {
        int x, y;
        do {
            System.out.println("Введите координат в формате X Y");
            x = sc.nextInt() - 1;
            y = sc.nextInt() - 1;
        } while (!isCellValid(x, y));
        map[y][x] = dot_x;

    }

    public static boolean isCellValid(int x, int y) {
        if (x < 0 || x >= size || y < 0 || y >= size) return false;
        if (map[y][x] == dot_empty) return true;
        return false;
    }

    public static void aiTurn() {
        int x, y;
        do {
            x = rand.nextInt(size);
            y = rand.nextInt(size);
        } while (!isCellValid(x, y));
        System.out.println("Компьютер походил в точку " + (x + 1) + " " + (y + 1));
        map[y][x] = dot_o;
    }

    public static boolean checkWin(char symb){
         for (int i = 0; i < size; i++) {
            int hor = 0; int ver = 0;
            for (int j = 0; j < size; j++) {
                if (map[i][j] == symb) hor++;
                if (map[j][i] == symb) ver++;
            }
            if (hor == size-1 || ver == size-1 ) return true;
        }
        int diag1 = 0; int diag2 = 0;
        for (int i = 0; i < size ; i++) {
            if (map[i][i] == symb) diag1++;
            if (map[i][(size-1)-i] == symb) diag2++;
        }
        if (diag1 == size-1 || diag2 == size-1) return true;
        return false;
    }
       /*for (int i = 0; i < size-1; i++)
            if ((map[0][i] == symb && map[1][i] == symb && map[2][i] == symb && map[3][i] == symb)||
                    (map[i][0] == symb && map[i][1] == symb && map[i][2] == symb && map[i][3] == symb))
                return true;
            if ((map[0][0] == symb && map[1][1] == symb && map[2][2] == symb && map[3][3] == symb)
                       || (map[3][0] == symb && map[2][1] == symb && map[1][2] == symb && map[0][3] == symb))
                   return true;
               return false;*/

    public static boolean isMapFull() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (map[i][j] == dot_empty) return false;
            }
        }
        return true;
    }
}


