package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {

    public static double sumAndMultiply(double first, double second) {
        return sum(first, second)
                + multiply(first, second);
    }

    public static double differenceAndDivision(double third, double fourth) {
        return difference(third, fourth)
                - division(third, fourth);
    }

    public static double sumOfTwo(double difference, double division) {
        return difference + division;
    }

    public static double all(double multiply, double difference, double division, double sum) {
        return multiply + difference + division + sum;
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета №1 равен: " + sumAndMultiply(10, 20));
        System.out.println("Результат расчета №2 равен: " + differenceAndDivision(40, 16));
        System.out.println("Результат расчета №3 равен: " + differenceAndDivision(30, 15));
        System.out.println("Результат расчета №4 равен: " + sumOfTwo(21.5, 13.0));
        System.out.println("Результат расчета №5 равено: " + all(230.0, 21.5, 13.0, 34.5));

    }
}
