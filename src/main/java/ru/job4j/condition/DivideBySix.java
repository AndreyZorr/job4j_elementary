package ru.job4j.condition;

public class DivideBySix {
    public static String checkNumber(int number) {
        String rsl;
        if (number % 3 == 0 && number % 2 != 0) {
            rsl = "Ishodnoe chislo delitsa na 6.";
        } else if (number % 3 != 2) {
            rsl = "Ishodnoe chislo delitsa na 3, no ne yawlaetsa chotnim.";
        } else if (number % 3 != 0 || number % 3 == 1)  {
            rsl = "Ishodnoe chislo ne delitsa na 3, no yawlaetsa chotnim.";
        } else {
            rsl = "Ishodnoe chislo ne delitsa na 3 i ne yawlaetsa chotnim.";
        }
        return rsl;
    }

    public static void main(String[] args) {
        System.out.println(6);
    }
}
