package ru.job4j.array;

public class MinDiapason {
    public static int findMin(int[] array, int start, int finish) {
        int min = array[start];
        for (int i = start + 1; i <= finish; i++) {
            int meaning = array[i];
            if (meaning < min) {
                min = meaning;
            }
        }
        return min;
    }
}