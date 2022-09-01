package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        boolean max = false;
        int result = max ? left : right;
        return result;
    }

    public static void main(String[] args) {
        int msg = Max.max(1, 2);
        System.out.print(msg);
    }
}
