package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {

    public static double sumOfTwo(double difference, double division) {
        return sum(difference, division);
    }

    public static double differenceAndDivision(double third, double fourth) {
        return difference(third, fourth)
                - division(third, fourth);
    }

    public static double sumAndMultiply(double first, double second) {
        return sum(first, second)
                + multiply(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета равен: " + sumAndMultiply(10, 20));
        System.out.println("Результат расчета №2 равен: " + differenceAndDivision(40, 16));
        System.out.println("Результат расчета №3 равен: " + differenceAndDivision(30, 20));
        System.out.println("Результат расчета №4 равен: " + sumOfTwo(21.5, 8.5));

    }
}
