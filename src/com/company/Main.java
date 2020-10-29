package com.company;

import java.util.Scanner;

public class Main {

        public static void main(String[] args) {
            int height = readHeight();
            int width = readWidth();

            checkExistenceFigure(height, width);
            drawFigure(height, width);
        }

         public static int readHeight() {
         Scanner scanner = new Scanner(System.in);
             System.out.print("Введите значение высоты: ");
            return scanner.nextInt();
         }

         public static int readWidth() {
         Scanner scanner = new Scanner(System.in);
            System.out.print("Введите значение ширины: ");
            return scanner.nextInt();
         }

         public static void checkExistenceFigure(int h, int w) {
            if ((h>=3) && (w>=3)) {
                System.out.println("Введенные значения корректны.");
            } else {
                System.out.println("Введенные значения не корректны.");
            }
         }

        public static void drawFigure(int height, int width) {
            for (int i = 0; i < height; i++) {
                if ((i == 0) || (i == height - 1)) {
                    System.out.print(" ");
                    for (int j = 0; j < width - 2; j++) {
                        System.out.print("-");
                    }
                    System.out.println(" ");
                } else {
                    System.out.print("|");
                    for (int j = 0; j < i && j < (((width + 0.0)/ 2) - 1); j++) {
                        System.out.print(" ");
                    }
                    for (int j = 0; j < width - 2 * i - 2; j++) {
                        System.out.print("*");
                    }
                    for (int j = 0; j < i && j < (((width + 0.0)/ 2) - 1); j++) {
                        System.out.print(" ");
                    }
                    System.out.println("|");
                }

            }
        }
}


