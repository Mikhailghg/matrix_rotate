import java.util.Random;
import java.util.Scanner;

public class Main {
    public static final int SIZE = 8;

    public static void main(String[] args) {
        int[][] colors = new int[SIZE][SIZE];
        int[][] rotatedColors = new int[SIZE][SIZE];
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                // для случайных значений воспользуемся готовым решением из библиотеки java.util.Random
                colors[i][j] = random.nextInt(256);
            }
        }

        System.out.println("Изначально сгенерированная матрица");
        outToScreen(colors);
        System.out.println("Выберите угол поворота матрицы по часовой стрелке");
        System.out.println("1. Поворот на 90 градусов");
        System.out.println("2. Поворот на 180 градусов");
        System.out.println("3. Поворот на 270 градусов");
        String input = scanner.nextLine();
        int operation = Integer.parseInt(input);

        switch (operation) {
            case 1:
                for (int i = 0; i < SIZE; i++) {
                    for (int j = 0; j < SIZE; j++) {
                        rotatedColors[i][j] = colors[j][SIZE - 1 - i];
                    }
                }
                System.out.println(" ");
                System.out.println("Матрица после поворота на 90 градусов");
                break;

            case 2:
                for (int i = 0; i < SIZE; i++) {
                    for (int j = 0; j < SIZE; j++) {
                        rotatedColors[i][j] = colors[SIZE - 1 - i][SIZE - 1 - j];
                    }
                }
                System.out.println(" ");
                System.out.println("Матрица после поворота на 180 градусов");
                break;

            case 3:
                for (int i = 0; i < SIZE; i++) {
                    for (int j = 0; j < SIZE; j++) {
                        rotatedColors[i][j] = colors[SIZE - 1 - j][SIZE - 1 - i];
                    }
                }
                System.out.println(" ");
                System.out.println("Матрица после поворота на 270 градусов");
                break;


        }
        outToScreen(rotatedColors);
    }

    public static void outToScreen(int[][] colors) {
        System.out.println(" ");
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {

                System.out.format("%4d", colors[i][j]);
            }

            System.out.println();
        }


    }
}