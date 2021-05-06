package org.example.lesson_d;

import java.util.Random;
import java.util.Scanner;

public class Homework {
    private static char[][] gameField;
    private static int fieldSizeX;
    private static int fieldSizeY;
    private static final char DOT_HUMAN = 'X';
    private static final char DOT_AI = '0';
    private static final char DOT_EMPTY = '.';
    private static final Scanner SCANNER = new Scanner(System.in);
    private static final Random random = new Random();
    private static int scoreHuman = 0;
    private static int scoreAI = 0;

    public static void main(String[] args) {
        playGame();
    }

    private static void initialField () {
        System.out.println("Введите размерность игрового поля (например, 5)");
        fieldSizeY=SCANNER.nextInt();
        fieldSizeX = fieldSizeY;
        gameField = new char[fieldSizeY][fieldSizeX];
        for (int i = 0; i < fieldSizeY; i++){
            for (int j = 0; j < fieldSizeX; j++){
                gameField[i][j] = DOT_EMPTY;
            }
        }
    }

    private static void printField () {
        for (int i = 0; i < fieldSizeY; i++){
            for (int j = 0; j < fieldSizeX; j++){
                System.out.print(gameField[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    private static boolean emptyCell (int y, int x){
        return gameField[y][x] == DOT_EMPTY;
    }

    private static boolean outOfField (int y, int x){
        return x >= 0 && y >= 0 && x <= fieldSizeX && y <=fieldSizeY;
    }

    private static void humanMove () {
        int x;
        int y;
        do {
            System.out.println("Укажите координаты хода (y - строка и x - столбец): ");
            x = SCANNER.nextInt()-1;
            y = SCANNER.nextInt()-1;
            if (!outOfField(y,x)) System.out.println("Вы вышли за пределы поля!");
        }
        while (!outOfField(y, x) || !emptyCell(y,x));
        gameField[y][x] = DOT_HUMAN;
    }

    private static void aiMove () {
        int x;
        int y;

        x = random.nextInt(fieldSizeX);
        y = random.nextInt(fieldSizeY);
        gameField[y][x] = DOT_AI;
    }

    private static boolean checkWin(char c) {
        boolean right, left, cols, rows;
        right = true;
        left = true;
        for (int i=0; i<fieldSizeY; i++) {
            right &= (gameField[i][i] == c);
            left &= (gameField[fieldSizeY-i-1][i] == c);
        }

        if (right || left) return true;

        for (int col=0; col<fieldSizeX; col++) {
            cols = true;
            rows = true;
            for (int row=0; row<fieldSizeY; row++) {
                cols &= (gameField[col][row] == c);
                rows &= (gameField[row][col] == c);
            }
            if (cols || rows) return true;
        }
        return false;
    }

    private static boolean checkDraw() {
        for (int y = 0; y < fieldSizeY; y++) {
            for (int x = 0; x < fieldSizeX; x++) {
                if (emptyCell(x, y)) return false;
            }
        }
        return true;
    }

    private static boolean gameCheck(char dot) {
        if (checkWin(dot)) {
            System.out.println(dot == DOT_HUMAN ? "Вы победили!" : "Выиграл компьютер!");
            if (dot == DOT_HUMAN) scoreHuman++;
            else scoreAI++;
            return true;
        }
        if (checkDraw()) {
            System.out.println("Ничья!");
            return true;
        }
        return false;
    }

    private static void playGame() {
        while (true) {
            initialField();
            printField();

            while (true) {
                humanMove();
                printField();
                if (gameCheck(DOT_HUMAN)) break;

                aiMove();
                printField();
                if (gameCheck(DOT_AI)) break;
            }
            System.out.printf("SCORE IS:  HUMAN   AI\n             %d     %d\n", scoreHuman, scoreAI);
            System.out.print("Wanna play again? (y or n) >>> ");
            if (!SCANNER.next().toLowerCase().equals("y")) break;
        }
    }
}
