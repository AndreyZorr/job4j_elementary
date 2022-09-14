package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int number) {
        boolean prime = true;
        for (int a = 1; a <= number; a++) {
            if ((number % a) == 0) {
                prime = false;
                break;
            }
            if (number > 1) {
                break;
            }
        }
            return prime;
    }
}
