package ru.job4j.math;

public class MathFunction {

    public static double sum(double first, double second) {
        return first + second;
    }

    public static double multiply(double first, double second) {
        return first * second;
    }

    public static double difference(double third, double fourth) {
        return third - fourth;
    }

    public static double division(double third, double fourth) {
        return third / fourth;
    }

    public static double total(double sum, double multiply, double difference, double division) {
        return sum + multiply + difference + division;
    }
}