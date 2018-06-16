package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = 2;
        double b = 2;
        double c = 2;
        System.out.println("Введите длины трёх сторон треугольника a b c: ");
        if (sc.hasNextDouble()) { //проверка корректных символов
            a = sc.nextDouble();
            b = sc.nextDouble();
            c = sc.nextDouble();


            if (a + b > c && a + c > b && b + c > a) {
                if (a == b && b == c && a == c) {
                    System.out.print("Треугольник равносторонний.");
                } else if (a == b || b == c || a == c) {
                    System.out.print("Треугольник равнобедренный.");
                } else {
                    System.out.print("Треугольник обычный.");
                }
            } else {
                System.out.println("Треугольника с такими длинами сторон не существует.");
            }
        } else {
            System.out.println("Вы ввели недопустимый символ. Введите целое или дробное число. Отрицательные числа приравниваются к положительным.");

        }
    }
}

