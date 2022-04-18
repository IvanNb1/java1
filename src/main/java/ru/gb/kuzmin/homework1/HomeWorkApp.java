package ru.gb.kuzmin.homework1;

public class HomeWorkApp {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign(2,4);
        printColor(1);
        compareNumbers(10,2);

    }

    private static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    private static void checkSumSign(int a, int b) {

        int c = a + b;
        if (c >= 0) {
            System.out.println("Сумма положительная");
            return;
        }
        System.out.println("Сумма отрицательная");
    }

    private static void printColor(int value) {

        if (value <= 0) {
            System.out.println("Красный");
        }
        if (value > 0 && value <= 100) {
            System.out.println("Желтый");
        }
        if (value > 100) {
            System.out.println("Зеленый");
        }
    }

    private static void compareNumbers(int a, int b) {

        if (a >= b) {
            System.out.println(" a>= b");
        } else {
            System.out.println("a < b");
        }
    }

    }
